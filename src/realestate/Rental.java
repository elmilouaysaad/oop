package realestate;

import user.Owner;
import enume.Type;

public class Rental {
    protected RealEstate realEstate;
    protected Owner owner;
    protected int durationInMonths;
    protected double price;
    protected Type type;

    // Constructor
    public Rental(RealEstate realEstate, Owner owner, int durationInMonths, double price, Type type) {
        this.realEstate = realEstate;
        this.owner = owner;
        this.durationInMonths = durationInMonths;
        this.price = price;
        this.type = type;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    // Abstract method to calculate rental cost
    public  double calculateRentalCost(){
        double totalCost = getPrice() * getDurationInMonths();
        double discount = totalCost  * getDurationInMonths();
        return totalCost - discount;
    }
}
