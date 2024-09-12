package com.hms.model;
/**
 *
 * @author Atia
 */

public class RadiologicalTest extends LabTest {

    private String plateDimension;
    // Constructor

      public RadiologicalTest(){}
    
    public RadiologicalTest(String title, double cost, boolean isAvailable,String plateDimension) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.plateDimension = plateDimension;
    }
    
    
    
//    // Method to show test details
//   public String show() {
//        String output = "Test name: " + this.title + "\n" 
//                      + "Cost: " + this.cost + "\n";
//                      + "title:" + this.title +"\n";
//        return output;
//    }
     
  
      
    
//     Method to search for a test by title
//    void search(String title) {
//        if (this.getTitle().equals(title)) { // Use equals() for string comparison
//            System.out.println(show()); // Call the show method
//        } else {
//            System.out.println("Test not found.");
//        }
//    }

    @Override
    public String toString() {
        return "RadiologicalTest{" + super.toString()+ "plateDimension=" + plateDimension + '}';
    }
}
