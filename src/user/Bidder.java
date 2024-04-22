package user;

public class Bidder extends Person {
    private double bid;

    public Bidder(String name, String address, String phone, int age, String username, String password, double bid) {
        super(name, address, phone, age, username, password);
            this.bid = bid;
      
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
