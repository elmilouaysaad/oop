/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import exception.*;

/**
 *
 * @author mello
 */


public class Buyer extends Person {
  

    public Buyer(String name, String address, String phone,int age) {
    super(name, address, phone, age);
    }

 

    public void verifyAge() throws UnderAgeException {
        // Verify if the buyer is over 18
        if (super.getAge() < 18) {
            throw new UnderAgeException("Buyer is under 18 years old.");
        }
    }

    @Override
    public void displayInformation() {
        // Displaying information about the worker
        System.out.println("Worker Information:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("Age: " + getAge());
    }
}

