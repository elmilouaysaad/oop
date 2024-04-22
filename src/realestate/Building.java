/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;
import user.*;

/**
 *
 * @author mello
 */
public class Building extends RealEstate {
    private int numberOfApartments;
    private int numberOfStudios;

    // Constructor
    public Building(String address, Owner owner, Manager manager, boolean ForSale, boolean ForRent, boolean ShortTerm, boolean LongTerm, int numberOfApartments, int numberOfStudios) {
        super(address, owner, manager, ForSale, ForRent, ShortTerm, LongTerm);
        this.numberOfApartments = numberOfApartments;
        this.numberOfStudios = numberOfStudios;
    }

    // Implementation of abstract method calculatePrice() specific to buildings
    @Override
    public double calculatePrice() {
        // Add your specific calculation logic here based on the characteristics of a building
        return 0.0; // Placeholder return value
    }

    // Getters and setters
    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfStudios() {
        return numberOfStudios;
    }

    public void setNumberOfStudios(int numberOfStudios) {
        this.numberOfStudios = numberOfStudios;
    }
}

