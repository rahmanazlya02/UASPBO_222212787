/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uas_222212787.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import uas_222212787.Controller.Controller_Mahasiswa;

/**
 *
 * @author Nazlya
 */
public class EntriPanel extends javax.swing.JPanel {
    Controller_Mahasiswa controller_mahasiswa;

    /**
     * Creates new form EntriPanel
     */
    public EntriPanel() {
        initComponents();
        controller_mahasiswa = new Controller_Mahasiswa(this);
        controller_mahasiswa.isiTableMhs();
    }

    EntriPanel(JScrollPane contentScrollPane) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kementerianComboBox = new javax.swing.JComboBox<>();
        nimTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();
        hapusButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCariData = new javax.swing.JTextField();
        cariButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        pdfButton = new javax.swing.JButton();
        judulLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(57, 167, 255));
        setPreferredSize(new java.awt.Dimension(1440, 830));

        jPanel1.setBackground(new java.awt.Color(224, 244, 255));

        alamatTextArea.setColumns(20);
        alamatTextArea.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        alamatTextArea.setRows(4);
        jScrollPane1.setViewportView(alamatTextArea);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Alamat :");

        namaTextField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Email :");

        simpanButton.setBackground(new java.awt.Color(255, 102, 102));
        simpanButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        simpanButton.setForeground(new java.awt.Color(255, 255, 255));
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin :");

        emailTextField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        genderButtonGroup.add(lakiRadioButton);
        lakiRadioButton.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lakiRadioButton.setText("Laki-Laki");

        genderButtonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        perempuanRadioButton.setText("Perempuan");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Kementerian :");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel2.setText("NIM : ");

        kementerianComboBox.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        kementerianComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kesekretariatan", "Event dan Pengajaran", "Media dan Informasi", "Ekonomi Kreatif", "Penelitian dan Pengembangan", " " }));

        nimTextField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        nimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTextFieldActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(255, 102, 102));
        resetButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Nama :");

        jLabel8.setBackground(new java.awt.Color(255, 51, 102));
        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel8.setText("Form Isi Data Diri Anggota");

        editButton.setBackground(new java.awt.Color(255, 102, 102));
        editButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("  Edit  ");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTextField)
                                    .addComponent(nimTextField)
                                    .addComponent(namaTextField)
                                    .addComponent(kementerianComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lakiRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(perempuanRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(simpanButton)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lakiRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perempuanRadioButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kementerianComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(224, 244, 255));

        jScrollPane2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        mahasiswaTable.setBackground(new java.awt.Color(255, 255, 232));
        mahasiswaTable.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Email", "Kementerian", "Alamat"
            }
        ));
        mahasiswaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mahasiswaTable);

        hapusButton.setBackground(new java.awt.Color(255, 102, 102));
        hapusButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hapusButton.setForeground(new java.awt.Color(255, 255, 255));
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        printButton.setBackground(new java.awt.Color(255, 102, 102));
        printButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Export to Csv");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel9.setText("Daftar Data Diri Anggota");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cari Data :");

        cariButton.setBackground(new java.awt.Color(255, 102, 102));
        cariButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cariButton.setForeground(new java.awt.Color(255, 255, 255));
        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(255, 102, 102));
        refreshButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        pdfButton.setBackground(new java.awt.Color(255, 102, 102));
        pdfButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pdfButton.setForeground(new java.awt.Color(255, 255, 255));
        pdfButton.setText("Export to PDF");
        pdfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(hapusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(printButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pdfButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCariData, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cariButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(refreshButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCariData)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cariButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(255, 255, 255));
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setText("ENTRI DATA DIRI ANGGOTA UKM STIS MENGAJAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(judulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(judulLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.insertMhs();
        controller_mahasiswa.isiTableMhs();
        controller_mahasiswa.reset();
        
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void nimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.update();
        controller_mahasiswa.isiTableMhs();
        controller_mahasiswa.reset();
    }//GEN-LAST:event_editButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.delete();
        controller_mahasiswa.isiTableMhs();
        controller_mahasiswa.reset();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.carinama();
    }//GEN-LAST:event_cariButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.isiTableMhs();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void mahasiswaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaTableMouseClicked
        // TODO add your handling code here:
        controller_mahasiswa.isiField(mahasiswaTable.getSelectedRow());
    }//GEN-LAST:event_mahasiswaTableMouseClicked

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.printToCSV();
    }//GEN-LAST:event_printButtonActionPerformed

    private void pdfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfButtonActionPerformed
        // TODO add your handling code here:
        controller_mahasiswa.exportToPDF();
    }//GEN-LAST:event_pdfButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JButton cariButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JComboBox<String> kementerianComboBox;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JButton pdfButton;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField txtCariData;
    // End of variables declaration//GEN-END:variables

    public JTextArea getAlamatTextArea() {
        return alamatTextArea;
    }

    public JButton getCariButton() {
        return cariButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public JButton getHapusButton() {
        return hapusButton;
    }

    public JRadioButton getLakiRadioButton() {
        return lakiRadioButton;
    }

    public JTable getMahasiswaTable() {
        return mahasiswaTable;
    }

    public JTextField getNamaTextField() {
        return namaTextField;
    }

    public JTextField getNimTextField() {
        return nimTextField;
    }

    public JRadioButton getPerempuanRadioButton() {
        return perempuanRadioButton;
    }

    public JButton getPrintButton() {
        return printButton;
    }

    public JComboBox<String> getKementerianComboBox() {
        return kementerianComboBox;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public JButton getSimpanButton() {
        return simpanButton;
    }

    public JTextField getTxtCariData() {
        return txtCariData;
    }

    public ButtonGroup getGenderButtonGroup() {
        return genderButtonGroup;
    }

    public void setGenderButtonGroup(ButtonGroup genderButtonGroup) {
        this.genderButtonGroup = genderButtonGroup;
    }

    // Method to print data to CSV file
    public void printToCSV(File file) throws IOException {
        TableModel model = mahasiswaTable.getModel();
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.write(model.getColumnName(i) + ",");
            }
            writer.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString() + ",");
                }
                writer.write("\n");
            }
        }
    }

    public void showMessage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}