/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import realestate.RealEstate;

/**
 *
 * @author mello
 */
public abstract class Renter extends Person{
    public Renter (String name, String address, String phone,int age, String username, String password){
     super( name,  address,  phone, age);
    }
    public abstract void rentProperty(RealEstate realEstate);
}
