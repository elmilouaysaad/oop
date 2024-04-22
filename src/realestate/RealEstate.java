package realestate;

import user.*;
import java.util.ArrayList;
import java.util.List;
import other.Interaction;

public abstract class RealEstate {
    private String address;
    private Owner owner;
    protected Manager manager;

    private Housekeeper housekeeper;
    private boolean ForSale;
    private boolean ForRent;
    private boolean ShorTerm;
    private boolean LongTerm;
    private List<Interaction> interactionLog;

    // Constructor
    public RealEstate(String address, Owner owner, Manager manager, boolean ForSale, boolean ForRent, boolean ShortTerm, boolean LongTerm) {
        this.address = address;
        this.owner = owner;
        this.manager = manager;
        this.ForSale = ForSale;
        this.ForRent = ForRent;
        this.ShorTerm = ShortTerm;
        this.LongTerm = LongTerm;
        this.interactionLog = new ArrayList<>();
    }
   
    public Housekeeper getHousekeeper() {
        return housekeeper;
    }

    public void setHousekeeper(Housekeeper housekeeper) {
        this.housekeeper = housekeeper;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public boolean ForSale() {
        return ForSale;
    }

    public void setForSale(boolean forSale) {
        ForSale = forSale;
    }

    public boolean ForRent() {
        return ForRent;
    }

    public void setForRent(boolean forRent) {
        ForRent = forRent;
    }

    public boolean ShorTerm() {
        return ShorTerm;
    }

    public void setShortTerm(boolean shortTerm) {
        ShorTerm = shortTerm;
    }

    public boolean LongTerm() {
        return LongTerm;
    }

    public void setLongTerm(boolean longTerm) {
        LongTerm = longTerm;
    }

    public void addInteraction(Interaction interaction) {
        interactionLog.add(interaction);
    }

    public List<Interaction> getInteractionLog() {
        return interactionLog;
    }
}
