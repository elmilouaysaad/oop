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
public class Villa extends RealEstate {
    private int numberOfRooms;
    private double landArea;

    // Constructor
    public Villa(String address, Owner owner, boolean isForSale, boolean isForRent, boolean isShortTermRental, boolean isLongTermRental, int numberOfRooms, double landArea) {
        super(address, owner, isForSale, isForRent, isShortTermRental, isLongTermRental);
        this.numberOfRooms = numberOfRooms;
        this.landArea = landArea;
    }


    @Override
    public double calculatePrice() {
        //needs more thought
        double basePricePerSquareMeter = 1000; 
        return basePricePerSquareMeter * landArea;
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }
}
