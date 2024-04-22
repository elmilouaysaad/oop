/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;
import user.*;
import enume.*;

/**
 *
 * @author mello
 */
public class Villa extends RealEstate  {
    private int numberOfRooms;
    private double landArea;

    // Constructor
    public Villa(String address, Owner owner, Manager manager, boolean ForSale, boolean ForRent, boolean ShortTerm, boolean LongTerm, int numberOfRooms, double landArea) {
        super(address, owner, manager, ForSale, ForRent, ShortTerm, LongTerm);
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
