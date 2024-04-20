/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import realestate.*;

/**
 *
 * @author mello
 */
public class Student extends Renter {
    private String universityName;

    public Student(String name, String address, String phone, int age, String universityName) {
        super(name, address, phone, age);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

  
    @Override
    public void rentProperty(RealEstate realEstate) {
        // Implement rentProperty method for a student
        // Add logic here for renting a property by a student
        System.out.println(getName() + " is renting a property at " + realEstate.getAddress() + " for university purposes.");
    }

    @Override
    public void displayInformation() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
