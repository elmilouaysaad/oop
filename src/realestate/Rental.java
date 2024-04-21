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
public abstract class Rental {
    protected RealEstate realEstate;
    protected Owner owner;
    protected int durationInMonths;
    protected double price;

    // Constructor
    public Rental(RealEstate realEstate, Owner owner, int durationInMonths, double price) {
        this.realEstate = realEstate;
        this.owner = owner;
        this.durationInMonths = durationInMonths;
        this.price = price;
    }

    // Getters and setters
    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost();
}

