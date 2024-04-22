import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
      System.out.println("1. Browse For Rent");
      System.out.println("2. Browse For Purchase");
      System.out.println("3. Browse For Bidding");
      System.out.println("4. List a Proprety ");
      System.out.println("5. Logout");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character

      switch (choice) {
        case 1 -> {
          System.out.println("\n=== Agency ===");
          VillaCollection.printAllVillas();
          System.out.println("1. Rent ");
          System.out.println("2. Bid ");
          System.out.println("3. Buy ");
          switch (choice){
            case 1  -> {
              String filePath = "example_villas.txt";
              VillaCollection villaCollection = new VillaCollection();


            }


          }


        }
        case 2 -> {
            
            }
       
        case 3 -> {
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