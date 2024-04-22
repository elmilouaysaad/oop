package user;
import realestate.*;

public class Worker extends Renter {
    private String profession;

    public Worker(String name, String address, String phone, int age, String username, String password, String profession) {
        super(name, address, phone, age, username, password);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void rentProperty(RealEstate realEstate) {
        // Implementation specific to renting a property for a worker
        System.out.println(getName() + " is renting property for work purposes.");
        // Additional logic specific to workers
    }

    @Override
    public void displayInformation() {
        // Displaying information about the worker
        System.out.println("Worker Information:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("Age: " + getAge());
        System.out.println("Profession: " + profession);
    }

    // Overriding toString method to provide string representation of Worker object
    @Override
    public String toString() {
        return super.toString() + "\nProfession: " + profession;
    }
}
