package com.hms.model;
/**
 *
 * @author Atia
 */

public class PathologicalTest extends LabTest{

//    public String title;
//    public double cost;
//    public boolean isAvailable;
    public String  reagent;
    
    // Constructor
    public PathologicalTest(String text, double parseDouble, boolean selected){}

    public PathologicalTest( String title, double cost, boolean isAvailable, String reagent) {
        super(title, cost, isAvailable);
        this.reagent = reagent;
    }
    
//    public PathologicalTest(String title, double cost, boolean isAvailable,String reagent) {
//        this.title = title;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
//        this.reagent = reagent;
//    }

//    // Method to show test details
//   public String toString() {
//        String output = "Test name: " + this.title + "\n" 
//                      + "Cost: " + this.cost + "\n";
//                      
//        return output;
//    }

    @Override
    public String toString() {
        return "PathologicalTest{"+super.toString() + "reagent=" + reagent + '}';
    }
   
  
}
