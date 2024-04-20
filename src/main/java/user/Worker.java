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
public class Worker extends Renter {
    private String profession;

    public Worker(String name, String address, String phone, int age, String profession) {
        super( name,  address,  phone, age);
        this.profession = profession;
    }


  
    @Override
    public void rentProperty(RealEstate realEstate) {
        // Implementation specific to renting a property for a worker
        System.out.println(getName() + " is renting property for work purposes.");
        // Additional logic specific to workers
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void displayInformation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

