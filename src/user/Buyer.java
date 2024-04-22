/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;


/**
 *
 * @author mello
 */


public class Buyer extends Person {
  

    public Buyer(String name, String address, String phone,int age,String username, String password) {
    super(name, address, phone, age, username, password);
    }

 

    @Override
    public void displayInformation() {
        // Displaying information about the worker
        System.out.println("Worker Information:");
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Phone: " + super.getPhone());
        System.out.println("Age: " + super.getAge());
    }
}

