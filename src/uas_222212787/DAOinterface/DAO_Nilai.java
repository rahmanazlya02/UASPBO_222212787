/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uas_222212787.DAOinterface;
import uas_222212787.Model.Model_Nilai;
import java.util.List;
/**
 *
 * @author Nazlya
 */
public interface DAO_Nilai {
    public void insert(Model_Nilai n);
    public void update(Model_Nilai n);
    
    public List<Model_Nilai> getAll();
    public List<Model_Nilai> getCari(String keyword);
    public Model_Nilai getNilaiByNim(String nim);
    public boolean isNilaiExist(String nim);
    public void deleteByNim(String nim);
}
