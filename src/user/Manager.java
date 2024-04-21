/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import realestate.*;
import java.util.ArrayList;


public class Manager extends Person {
    private ArrayList<RealEstate> managedRealEstates;

    // Constructor
    public Manager(String name, String address, String phone, int age) {
        super(name, address, phone, age);
        this.managedRealEstates = new ArrayList<>();
    }

    // Method to manage a real estate
    public void addManagedRealEstate(RealEstate realEstate) {
        managedRealEstates.add(realEstate);
    }

    // Method to display manager information
    @Override
    public void displayInformation() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Age: " + super.getAge());
        System.out.println("Managed Real Estates:");
        for (RealEstate realEstate : managedRealEstates) {
            System.out.println("- " + realEstate);
        }
    }
}

