/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author ASUS
 */
public class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    
    public LabTest() {}

    public LabTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "LabTest{" + "title=" + title + ", cost=" + cost + ", isAvailable=" + isAvailable + '}';
    }

    
    
} 
    