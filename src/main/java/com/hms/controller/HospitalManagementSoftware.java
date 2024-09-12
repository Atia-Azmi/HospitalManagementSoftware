/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.view.home;

/**
 *
 * @author Atia Azmi
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new home().setVisible(true);
        
        PathologicalTest pTest = new PathologicalTest("CBC",400,true,"I DONT KNOW");
        //System.out.println(pTest.show());
        //pTest.setCost(300);
        //System.out.println("The update cost of CBC is"+pTest.getCost());
        //System.out.println(pTest.show());
       
        
    }
}
