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

    public Owner(String name, String address, String phone, int age, String username, String password) {
        super(name, address, phone, age);
        this.ownedRealEstates = new ArrayList<>();
    }
    
    public void removeOwnedRealEstate(RealEstate realEstate) {
        ownedRealEstates.remove(realEstate);
    }

    public List<RealEstate> getOwnedRealEstates() {
        return ownedRealEstates;
    }
    @Override
    public void displayInformation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInformation'");
    }
}

