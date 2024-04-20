package user;

public class Bidder extends Person {
    private double bid;

    public Bidder(String name, String address, String phone, int age, double bid) {
        super(name, address, phone, age);
        try {
            if (age < 18) {
                throw new UnderAgeException("Bidder must be over 18 to participate in auctions.");
            }
            this.bid = bid;
        } catch (UnderAgeException e) {
            System.err.println(e.getMessage());
            this.bid = -1; // Default bid value when age requirement is not met
        }
    }

    public void placeBid(double amount) {
        if (getAge() >= 18) {
            System.out.println(getName() + " placed a bid of $" + amount);
            this.bid = amount; // Update bid amount
        } else {
            System.out.println(getName() + " is not qualified to participate in the auction.");
        }
    }

    public double getBid() {
        return bid;
    }

    @Override
    public void displayInformation() {
        // Displaying information about the bidder
        System.out.println("Bidder Information:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("Age: " + getAge());
        System.out.println("Bid: $" + getBid());
    }
}
