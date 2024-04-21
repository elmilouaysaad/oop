/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;
import user.Owner;

/**
 *
 * @author mello
 */
public class Commercial extends RealEstate {
    private int numberOfFloors;
    private double area;

    // Constructor
    public Commercial(String address, Owner owner, boolean isForSale, boolean isForRent, boolean ShortTerm, boolean LongTerm, int numberOfFloors, double area) {
        super(address, owner, isForSale, isForRent, ShortTerm, LongTerm);
        this.numberOfFloors = numberOfFloors;
        this.area = area;
    }

    // Override calculatePrice() method
    @Override
    public double calculatePrice() {
        // Implement your logic to calculate the price for a commercial property
        // This could involve factors like area, location, demand, etc.
        return area * numberOfFloors * 1000; // Example calculation
    }

    // Getters and setters
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

