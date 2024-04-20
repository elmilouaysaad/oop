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
public class ShortTermRental extends Rental {
    private boolean isForSale;

    // Constructor
    public ShortTermRental(RealEstate realEstate, Owner owner, int durationInMonths, double price, boolean isForSale) {
        super(realEstate, owner, durationInMonths, price);
        this.isForSale = isForSale;
    }

    // Getter and setter for isForSale
    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    // Implementation of calculateRentalCost for ShortTermRental
    @Override
    public double calculateRentalCost() {
        // For short-term rental, simply return the total price
        return getPrice();
    }
}
