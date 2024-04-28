/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import realestate.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import other.*;

public class Manager extends Person {
    private ArrayList<RealEstate> managedRealEstates;
    private List<Interaction> interactionLog;

    // Constructor
    public Manager(String name, String address, String phone, int age) {
        super(name, address, phone, age);
        this.managedRealEstates = new ArrayList<>();
        this.interactionLog = new ArrayList<>();    
    }

    // Method to manage a real estate
    public void addManagedRealEstate(RealEstate realEstate) {
        managedRealEstates.add(realEstate);
    }
    public void assignHousekeeper(RealEstate realEstate, Housekeeper housekeeper) {
        if (managedRealEstates.contains(realEstate)) {
            realEstate.setHousekeeper(housekeeper);
            System.out.println("Housekeeper " + housekeeper.getName() + " assigned to " + realEstate.getClass().getSimpleName());
        } else {
            System.out.println(getName() + " does not manage " + realEstate.getClass().getSimpleName());
        }
    }
    public Interaction interact(Date date, String description, Person[] participants) {
      
        Interaction interaction = new Interaction(date, description, participants);
        
        this.addInteraction(interaction);
        return interaction;
    }

 public void addInteraction(Interaction interaction) {
        interactionLog.add(interaction);
    }

    public List<Interaction> getInteractionLog() {
        return interactionLog;
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

