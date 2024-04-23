import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enume.Type;
import realestate.*;
import user.*;
import other.*;

public class App {
    private List<Person> Preson;
    private List<User> Users;
    private List<RealEstate> RealEstate;
    private User currentUser;
    private Scanner scanner;

    public App(){

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
  public void mainmenu(){while (true) {
    if (currentUser == null) {
      System.out.println("\n=== Agency ===");
      System.out.println("1. Register");
      System.out.println("2. Login");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); 
      switch (choice) {
        case 1:
          System.out.print("Enter username: ");
          String regUsername = scanner.nextLine();
          System.out.print("Enter password: ");
          String regPassword = scanner.nextLine();
          register(regUsername, regPassword);
          break;
        case 2:
          System.out.print("Enter username: ");
          String loginUsername = scanner.nextLine();
          System.out.print("Enter password: ");
          String loginPassword = scanner.nextLine();
          login(loginUsername, loginPassword);
          break;
        case 3:
          System.out.println("Exiting.");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please enter a number between 1 and 3.");
      }
    } else {
      System.out.println("\n=== Agency ===");
      System.out.println("\n===    ===");
      System.out.println("1. i am a manager");
      System.out.println("2. i am an owner");
      System.out.println("3. i am looking to buy a proprety");
      System.out.println("4. Logout");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character

      switch (choice) {
        case 1 -> {
          // Prompt the user to enter manager information
        System.out.println("Enter manager information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
    

        // Create Manager object
        Manager manager = new Manager(name, address, phone, age);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Assign Houskeeper");
            System.out.println("2. Go back");
            System.out.print("Enter your choice: ");
            int nm = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (nm) {
                case 1:
                   
                    System.out.println("");    
                    //harcode a houskeeper to use the methode assignhousekeeper 
              Housekeeper housekeeper = new Housekeeper("Khadija", "456 Ifrane St", "066123568", 25, manager);
                     // Example of a managed Realestate
               RealEstate realEstate = new RealEstate("567 Ifrane Street", manager, Type.Villa, false, true, false, true);
               manager.addManagedRealEstate(realEstate);
               manager.assignHousekeeper(realEstate, housekeeper);
                    break;
                case 2:
                    exit = true;
                    System.out.println("Going back...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
      }
        case 2 -> {
            
            }
        case 3 -> {
            
            }
       
        case 4 -> {
            currentUser = null;
            System.out.println("Logged out successfully.");
            }
        default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
      }
    }
  }
}
        public static void main(String[] args) {
          App app = new App();
          app.mainmenu();
            
        }
        }