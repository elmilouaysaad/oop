/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import java.util.ArrayList;

import exception.*;

/**
 *
 * @author mello
 */


public class Seller extends Owner {
  
    RealEstate property;
    public Seller(String name, String address, String phone,int age,RealEstate property) {
    super(name, address, phone, age);
    this.property=property;
    }

 

    @Override
    public void displayInformation() {
        // Displaying information about the seller
        System.out.println("seller Information:");
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Age: " + super.getAge());
    }
}

