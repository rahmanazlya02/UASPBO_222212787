/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uas_222212787.DAOinterface;
import uas_222212787.Model.User;

/**
 *
 * @author Nazlya
 */
public interface DAO_User {
    User getUser(String username);
    void insert(User user);
} 
