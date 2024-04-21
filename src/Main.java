import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import realestate.*;
import user.*;


public class Main {
    private List<Person> Preson;
    private List<User> Users;
    private List<RealEstate> RealEstate;
    private User currentUser;
    private Scanner scanner;

    public Main(){

        this.Preson = new ArrayList<>();
        this.Users = new ArrayList<>();
        this.RealEstate = new ArrayList<>();
        this.currentUser = null;
        this.scanner = new Scanner(System.in);

    }
    // Registration
  public void register(String username, String password) {
    User newUser = new User(username, password);
    Users.add(newUser);
    System.out.println("Registration successful!");
  }

  // Login
  public void login(String username, String password) {
    for (User account : Users) {
      if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
        currentUser = account;
        System.out.println("Login successful!");
        return;
      }
    }
    System.out.println("Invalid username or password. Please try again.");
  }
        public static void main(String[] args) {
            
            Owner owner = new Owner("John Doe", "123 Main St", "555-1234", 35);

            // Creating a villa owned by the owner
            Villa villa = new Villa("456 Park Ave", owner, true, false, false, false, 4, 1000.0);
    
            // Displaying information about the owner and the villa
            //owner.displayInformation();
            System.out.println("Number of rooms in the villa: " + villa.getNumberOfRooms());
            System.out.println("Land area of the villa: " + villa.getLandArea());
    
            // Calculating and displaying the price of the villa
            System.out.println("Price of the villa: $" + villa.calculatePrice());
        }
        }