package user;

public class Bidder extends Person {
 
    public Bidder(String name, String address, String phone, int age) {
        super(name, address, phone, age);
    }
   
   
    @Override
    public void displayInformation() {
        // Displaying information about the bidder
        System.out.println("Bidder Information:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("Age: " + getAge());
    }
}
