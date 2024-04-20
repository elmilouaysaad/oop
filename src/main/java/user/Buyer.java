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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

