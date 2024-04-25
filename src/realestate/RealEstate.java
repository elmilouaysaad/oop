package realestate;

import user.*;
import enume.*;
import java.util.ArrayList;
import java.util.List;
import other.Interaction;

public class RealEstate {
    private String address;
    private Owner owner;
    private Manager manager;
    private Type type;
    private Housekeeper housekeeper;
    private boolean forSale; 
    private boolean forRent; 
    private boolean shortTerm; 
    private boolean longTerm; 
    private List<Interaction> interactionLog;

    // Constructor
    public RealEstate(String address, Owner owner, Manager manager, Type type, boolean forSale, boolean forRent, boolean shortTerm, boolean longTerm) {
        this.address = address;
        this.owner = owner;
        this.manager = manager;
        this.type = type;
        this.forSale = forSale;
        this.forRent = forRent;
        this.shortTerm = shortTerm;
        this.longTerm = longTerm;
        this.interactionLog = new ArrayList<>();
    }
    public RealEstate(String address, Manager manager, Type type, boolean forSale, boolean forRent, boolean shortTerm, boolean longTerm) {
        this.address = address;
        this.manager = manager;
        this.type = type;
        this.forSale = forSale;
        this.forRent = forRent;
        this.shortTerm = shortTerm;
        this.longTerm = longTerm;
        this.interactionLog = new ArrayList<>();
    }
    public RealEstate(String address, Owner ower, Type type, boolean forSale, boolean forRent, boolean shortTerm, boolean longTerm) {
        this.address = address;
        this.owner = owner;
        this.type = type;
        this.forSale = forSale;
        this.forRent = forRent;
        this.shortTerm = shortTerm;
        this.longTerm = longTerm;
        this.interactionLog = new ArrayList<>();
    }
    public RealEstate(String address, Type type, boolean forSale, boolean forRent, boolean shortTerm, boolean longTerm) {
        this.address = address;
        this.type = type;
        this.forSale = forSale;
        this.forRent = forRent;
        this.shortTerm = shortTerm;
        this.longTerm = longTerm;
        this.interactionLog = new ArrayList<>();
    }
    public Housekeeper getHousekeeper() {
        return housekeeper;
    }

    public void setHousekeeper(Housekeeper housekeeper) {
        this.housekeeper = housekeeper;
    }
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

    public boolean isForSale() { 
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public boolean isForRent() { 
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public boolean isShortTerm() { 
        return shortTerm;
    }

    public void setShortTerm(boolean shortTerm) {
        this.shortTerm = shortTerm;
    }

    public boolean isLongTerm() { 
        return longTerm;
    }

    public void setLongTerm(boolean longTerm) {
        this.longTerm = longTerm;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Type getType() {
        return type;
    }    
    
    public void addInteraction(Interaction interaction) {
        interactionLog.add(interaction);
    }

    public List<Interaction> getInteractionLog() {
        return interactionLog;
    }
    @Override
public String toString() {
    return "RealEstate{" +
            "address='" + address + '\'' +
            ", type=" + type +
            ", forSale=" + forSale +
            ", forRent=" + forRent+ 
            "}";
}
}
