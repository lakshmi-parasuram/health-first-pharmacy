/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hfp;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Data {
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        
        Patient patient1 = new Patient("patient1", "1234");
        users.add(patient1);
        Patient patient2 = new Patient("patient2", "1234");
        users.add(patient2);
        
        return users;
    }
}
