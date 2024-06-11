/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_222212787.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uas_222212787.DAOimplement.ImplementDAO_Mahasiswa;
import uas_222212787.DAOimplement.ImplementDAO_Nilai;
import uas_222212787.Model.Model_Mahasiswa;
import uas_222212787.Model.Model_Nilai;
import uas_222212787.Model.Tabel_Model_Mahasiswa;
import uas_222212787.View.EntriPanel;
import uas_222212787.View.MainFrame;
import uas_222212787.DAOinterface.DAO_Nilai;
import uas_222212787.DAOinterface.DAO_Mahasiswa;

/**
 *
 * @author Nazlya
 */
public class Controller_Mahasiswa {
    EntriPanel frame_mahasiswa;
    DAO_Mahasiswa implement_mahasiswa;
    DAO_Nilai implement_nilai;
    java.util.List<Model_Mahasiswa> listMhs;
    
    public Controller_Mahasiswa(EntriPanel frame_mahasiswa) {
        this.frame_mahasiswa = frame_mahasiswa;
        implement_mahasiswa = new ImplementDAO_Mahasiswa();
        implement_nilai = new ImplementDAO_Nilai();
        listMhs = implement_mahasiswa.getAll();
    }
    
    // Fungsi untuk mencetak data ke CSV
    public void printToCSV() {
    JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showSaveDialog(frame_mahasiswa);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();
        if (!filePath.toLowerCase().endsWith(".csv")) {
            selectedFile = new File(filePath + ".csv");
        }
        try {
            frame_mahasiswa.printToCSV(selectedFile);
        } catch (IOException ex) {
            ex.printStackTrace();
            frame_mahasiswa.showMessage("Error printing to CSV: " + ex.getMessage());
        }
    }
}

    
    //Tombol Reset
    public void reset(){
        frame_mahasiswa.getNimTextField().setText("");
        frame_mahasiswa.getNamaTextField().setText("");
        frame_mahasiswa.getGenderButtonGroup().clearSelection();
        frame_mahasiswa.getEmailTextField().setText("");
        frame_mahasiswa.getKementerianComboBox().setSelectedIndex(-1);
        frame_mahasiswa.getAlamatTextArea().setText("");
    }
    
    //Tampil data
    public void isiTableMhs(){
        listMhs = implement_mahasiswa.getAll();
        Tabel_Model_Mahasiswa tmb = new Tabel_Model_Mahasiswa(listMhs);
        frame_mahasiswa.getMahasiswaTable().setModel(tmb);
    }
    
    //Menampilkan data ke form ketika data diklik
    public void isiField(int row) {
        // Mendapatkan objek Mahasiswa dari list berdasarkan baris yang diklik
        Model_Mahasiswa mhs = listMhs.get(row);
    
        // Mengisi field NIM dan Nama
        frame_mahasiswa.getNimTextField().setText(mhs.getNim());
        frame_mahasiswa.getNamaTextField().setText(mhs.getNamaMhs());
    
        // Mengatur radio button berdasarkan gender
        if (mhs.getGender().equals("Laki-laki")) {
            frame_mahasiswa.getLakiRadioButton().setSelected(true);
        } else if (mhs.getGender().equals("Perempuan")) {
            frame_mahasiswa.getPerempuanRadioButton().setSelected(true);
        }
        
        frame_mahasiswa.getEmailTextField().setText(mhs.getEmail());
        frame_mahasiswa.getKementerianComboBox().setSelectedItem(mhs.getKementerian());
        frame_mahasiswa.getAlamatTextArea().setText(mhs.getAlamat());
    }
    
    //Insert data dari form ke database
    public void insertMhs() {
        try {
            // Validasi input
            String nim = frame_mahasiswa.getNimTextField().getText().trim();
            String nama = frame_mahasiswa.getNamaTextField().getText().trim();
            String email = frame_mahasiswa.getEmailTextField().getText().trim();
            String alamat = frame_mahasiswa.getAlamatTextArea().getText().trim();
            String gender = frame_mahasiswa.getLakiRadioButton().isSelected() ? "Laki-laki" : "Perempuan";
            String provinsi = frame_mahasiswa.getKementerianComboBox().getSelectedItem() != null ? frame_mahasiswa.getKementerianComboBox().getSelectedItem().toString().trim() : "";

            if (nim.isEmpty() || nama.isEmpty() || email.isEmpty() || alamat.isEmpty() || provinsi.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Semua field harus diisi!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!nim.matches("^[1-9][0-9]{8}$")) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "NIM harus terdiri dari 9 karakter angka 1-9.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nama.length() > 100) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Nama harus kurang dari 100 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") || email.length() > 100) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Email harus valid dan kurang dari 100 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (alamat.length() > 215) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Alamat harus kurang dari 215 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Membuat objek Mahasiswa
            Model_Mahasiswa mhs = new Model_Mahasiswa();
            mhs.setNim(nim);
            mhs.setNamaMhs(nama);
            mhs.setGender(gender);
            mhs.setEmail(email);
            mhs.setKementerian(provinsi);
            mhs.setAlamat(alamat);

            // Memanggil metode DAO untuk menyimpan data
            implement_mahasiswa.insert(mhs);

            // Tampilkan pesan sukses
            javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Data berhasil disimpan!", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Reset form setelah data disimpan
            reset();
            // Perbarui tabel mahasiswa
            isiTableMhs();
        } catch (Exception e) {
            // Tangani kesalahan
        javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Terjadi kesalahan: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }              
    }
    
    //Update Data dari tabel ke database
    public void update(){
        try {
            // Validasi input
            String nim = frame_mahasiswa.getNimTextField().getText().trim();
            String nama = frame_mahasiswa.getNamaTextField().getText().trim();
            String email = frame_mahasiswa.getEmailTextField().getText().trim();
            String alamat = frame_mahasiswa.getAlamatTextArea().getText().trim();
            String gender = frame_mahasiswa.getLakiRadioButton().isSelected() ? "Laki-laki" : "Perempuan";
            String provinsi = frame_mahasiswa.getKementerianComboBox().getSelectedItem() != null ? frame_mahasiswa.getKementerianComboBox().getSelectedItem().toString().trim() : "";

            if (nim.isEmpty() || nama.isEmpty() || email.isEmpty() || alamat.isEmpty() || provinsi.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Semua field harus diisi!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!nim.matches("^[1-9][0-9]{8}$")) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "NIM harus terdiri dari 9 karakter angka 1-9.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nama.length() > 100) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Nama harus kurang dari 100 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") || email.length() > 100) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Email harus valid dan kurang dari 100 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (alamat.length() > 215) {
                javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Alamat harus kurang dari 215 karakter.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Membuat objek Mahasiswa
            Model_Mahasiswa mhs = new Model_Mahasiswa();
            mhs.setNim(nim);
            mhs.setNamaMhs(nama);
            mhs.setGender(gender);
            mhs.setEmail(email);
            mhs.setKementerian(provinsi);
            mhs.setAlamat(alamat);

            // Memanggil metode DAO untuk memperbarui data
            implement_mahasiswa.update(mhs);

            // Tampilkan pesan sukses
            javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Data berhasil diperbarui! Silahkan update data di form nilai", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Reset form setelah data diperbarui
            reset();
            // Perbarui tabel mahasiswa
            isiTableMhs();
        } catch (Exception e) {
            // Tangani kesalahan
            javax.swing.JOptionPane.showMessageDialog(frame_mahasiswa, "Terjadi kesalahan: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Menghapus Data pada tabel
    public void delete(){        
        if(!frame_mahasiswa.getNimTextField().getText().trim().isEmpty()) {
        // Mengambil NIM dari field
        String nim = frame_mahasiswa.getNimTextField().getText().trim();
        implement_mahasiswa.delete(nim);
        // Memanggil metode deleteByNim dari ImplementDAO_Nilai
        implement_nilai.deleteByNim(nim);
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    } else {
        JOptionPane.showMessageDialog(frame_mahasiswa, "Silahkan Pilih Data yang Akan Dihapus");
    }
    }
    
    //Mencari Data 
    public void isiTableCariNama() {
        listMhs = implement_mahasiswa.getCariNama(frame_mahasiswa.getTxtCariData().getText());
        Tabel_Model_Mahasiswa tmb = new Tabel_Model_Mahasiswa(listMhs);
        frame_mahasiswa.getMahasiswaTable().setModel(tmb);
    }
    
    public void carinama(){
        if(!frame_mahasiswa.getTxtCariData().getText().trim().isEmpty()) {
            implement_mahasiswa.getCariNama(frame_mahasiswa.getTxtCariData().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame_mahasiswa, "Silahkan Pilih Data!");
        }
    }
}
