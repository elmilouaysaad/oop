/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;


/**
 *
 * @author mello
 */
public class Contractor extends Person {
    private Manager client;
    

    // Constructor
    public Contractor(String name, String address, String phone, int age, Manager client) {
        super(name, address, phone, age);
        this.client = client;
    }

    // Getter and setter for assignedManager
    public Manager GetClient() {
        return client;
    }

    public void setClient(Manager client) {
        this.client = client;
    }

    // Implementing abstract method from Person class
    @Override
    public void displayInformation() {
        System.out.println("Contractor Information:");
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Age: " + super.getAge());
        System.out.println("Assigned Manager: " + client.getName());
    }

   
}

