/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import realestate.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mello
 */
public class Owner extends Person {
    private List<RealEstate> ownedRealEstates;


    public Owner(String name, String address, String phone, int age) {
        super(name, address, phone, age);
        this.ownedRealEstates = new ArrayList<>();
    }
    public void removeOwnedRealEstate(RealEstate realEstate) {
        ownedRealEstates.remove(realEstate);
    }
    public void addOwnedRealEstate(RealEstate realEstate) {
        ownedRealEstates.add(realEstate);
    }

    public List<RealEstate> getOwnedRealEstates() {
        return ownedRealEstates;
    }

    @Override
    public void displayInformation() {   System.out.println("Owner Information:");
    System.out.println("Name: " + super.getName());
    System.out.println("Address: " + super.getAddress());
    System.out.println("Phone: " + super.getPhone());
    System.out.println("Age: " + super.getAge());
    System.out.println("Owned Real Estates:");
    for (RealEstate realEstate : ownedRealEstates) {
        System.out.println("- " + realEstate);
    }
    }
    public void DisplayOwnedRealEstate(){
        System.out.println("Owned Real Estates:");
        for (RealEstate realEstate : ownedRealEstates) {
            System.out.println("- " + realEstate);
        }

    }
}

