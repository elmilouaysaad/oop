package user;

public class Bidder extends Person {
    private String name;
    public Bidder(String name, String address, String phone, int age) {
        super(name, address, phone, age);
      this.name=name;
    }
    public String getName() {
        return name;
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
