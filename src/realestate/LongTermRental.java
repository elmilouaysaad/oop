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
public class LongTermRental extends Rental {
    private static final double MONTHLY_DISCOUNT_PERCENTAGE = 0.1; // 10% discount for long-term rentals

    // Constructor
    public LongTermRental(RealEstate realEstate, Owner owner, int durationInMonths, double price) {
        super(realEstate, owner, durationInMonths, price);
    }

    // Override method to calculate rental cost for long-term rental
    @Override
    public double calculateRentalCost() {
        double totalCost = getPrice() * getDurationInMonths();
        double discount = totalCost * MONTHLY_DISCOUNT_PERCENTAGE * getDurationInMonths();
        return totalCost - discount;
    }
}

