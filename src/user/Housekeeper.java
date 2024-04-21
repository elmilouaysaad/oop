/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;


/**
 *
 * @author mello
 */
public class Housekeeper extends Person {
    private Manager assignedManager;

    // Constructor
    public Housekeeper(String name, String address, String phone, int age, Manager assignedManager) {
        super(name, address, phone, age);
        this.assignedManager = assignedManager;
    }

    // Getter and setter for assignedManager
    public Manager getAssignedManager() {
        return assignedManager;
    }

    public void setAssignedManager(Manager assignedManager) {
        this.assignedManager = assignedManager;
    }

    // Implementing abstract method from Person class
    @Override
    public void displayInformation() {
        System.out.println("Housekeeper Information:");
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Age: " + super.getAge());
        System.out.println("Assigned Manager: " + assignedManager.getName());
    }

   
}

