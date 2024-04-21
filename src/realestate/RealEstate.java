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

    public abstract class RealEstate {
    private String address;
    private Owner owner;
    private boolean isForSale;
    private boolean isForRent;
    private boolean Shortterm;
    private boolean LongTerm;

    // Constructor
    public RealEstate(String address, Owner owner, boolean isForSale, boolean isForRent, boolean isShortTermRental, boolean isLongTermRental) {
        this.address = address;
        this.owner = owner;
        this.isForSale = isForSale;
        this.isForRent = isForRent;
        this.Shortterm = isShortTermRental;
        this.LongTerm = isLongTermRental;
    }

    // Abstract method to calculate price
    public abstract double calculatePrice();

    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    public boolean isForRent() {
        return isForRent;
    }

    public void setForRent(boolean forRent) {
        isForRent = forRent;
    }

    public boolean isShortTermRental() {
        return Shortterm;
    }

    public void setShortTermRental(boolean shortTermRental) {
        Shortterm = shortTermRental;
    }

    public boolean isLongTermRental() {
        return LongTerm;
    }

    public void setLongTermRental(boolean longTermRental) {
        LongTerm = longTermRental;
    }
}

