import java.sql.Date;
import java.util.*;

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
  public void register(User user) {
    Users.add(user);
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
  public void mainmenu(){
    while (true) {
  
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
          new SignUpGUI();
          while (SignUpGUI.getUser() == null) {
              System.out.print("");
          }
          User newUser=SignUpGUI.getUser();
          register(newUser);
          break;
        case 2:
          new LoginGUI();
          while (LoginGUI.getUsername() == null) {
            System.out.print("");
        }
          String loginUsername =LoginGUI.getUsername();
          String loginPassword = LoginGUI.getPassword();
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
      new AgencyGUI();
      while (AgencyGUI.getChoice()==0) {
        System.out.print("");
      }
      int choice =AgencyGUI.getChoice();

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
        int age = 0;
        boolean validAge = false; // to catch any non int input
        
        while (!validAge) {
            try {
                System.out.print("Age: ");
                age = Integer.parseInt(scanner.nextLine());
                validAge = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer for age.");
            }
        }

        // Create Manager object
        Manager manager = new Manager(name, address, phone, age);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Assign Houskeeper");
            System.out.println("2. Go back");
            System.out.print("Enter your choice: ");
            int nm = scanner.nextInt();
            scanner.nextLine(); 
          
            switch (nm) {
                case 1:
                   
                    System.out.println("");    
                    //harcode a houskeeper to use the methode assignhousekeeper 
              Housekeeper housekeeper1 = new Housekeeper("Zhor", "456 Ifrane St", "066123568", 25, manager);
              Housekeeper housekeeper2 = new Housekeeper("Fatna", "455 Ifrane St", "066123561", 28, manager);
              Housekeeper housekeeper3 = new Housekeeper("Fatima", "442 Ifrane St", "066123548", 29, manager);
              RealEstate realEstate = new RealEstate("567 Ifrane Street", manager, Type.Villa, false, true, false, true);
              System.out.println(" Which Houskeeper do you want to assign to. " + realEstate.getType()+ "on" +realEstate.getAddress());
              System.out.println(housekeeper1.getName());
              System.out.println(housekeeper2.getName());
              System.out.println(housekeeper3.getName());
              int a= scanner.nextInt();
              switch (a) {
                case 1:
                manager.addManagedRealEstate(realEstate);
                manager.assignHousekeeper(realEstate, housekeeper1);
                  break;
                case 2:
                manager.addManagedRealEstate(realEstate);
                manager.assignHousekeeper(realEstate, housekeeper2);
                case 3:
                manager.addManagedRealEstate(realEstate);
                manager.assignHousekeeper(realEstate, housekeeper3);
                default:
                  break;
              }

               
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
          System.out.println("Enter your information:");
          System.out.print("Name: ");
          String name = scanner.nextLine();
          System.out.print("Address: ");
          String address = scanner.nextLine();
          System.out.print("Phone: ");
          String phone = scanner.nextLine();
          int age = 0;
          boolean validAge = false; 
          
          while (!validAge) {
              try {
                  System.out.print("Age: ");
                  age = Integer.parseInt(scanner.nextLine());
                  validAge = true;
              } catch (NumberFormatException e) {
                  System.out.println("Please enter a valid integer for age.");
              }
          }
          Owner owner = new Owner(name, address, phone, age);

          boolean exit = false;
          while (!exit) {
              System.out.println("\nChoose an option:");
              System.out.println("1. View owned Propreties.");     
              System.out.println("2. Go back");
              System.out.print("Enter your choice: ");
              int nm = scanner.nextInt();
              scanner.nextLine(); // Consume newline
  
              switch (nm) {
                  case 1:
                     
                      System.out.println("");    
                      // realestat owned to use for methods of manager
                      List<RealEstate> realEstates = new ArrayList<>();
                      realEstates.add(new RealEstate("567 Ifrane Street", owner, Type.Villa, false, true, false, true));
                      realEstates.add(new RealEstate("123 Casablanca Street", owner, Type.Apartment, true, false, true, false));
                      realEstates.add(new RealEstate("890 Marrakech Street", owner, Type.Studio, true, true, false, false));
                      realEstates.add(new RealEstate("456 Tangier Street", owner, Type.Villa, false, false, true, true));
                      realEstates.add(new RealEstate("234 Rabat Street", owner, Type.Villa, true, false, true, true));
                  owner.DisplayOwnedRealEstate();
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
        case 3 -> { 
          System.out.println("Here are the availabe RealEstates :");
          RealEstateCollection realEstateCollection = new RealEstateCollection();

        // example real estate instances
        realEstateCollection.add(new RealEstate("567 Ifrane Street",  Type.Villa, false, true, false, true));
        realEstateCollection.add(new RealEstate("123 Casablanca Street",  Type.Apartment, true, false, true, false));
        realEstateCollection.add(new RealEstate("890 Marrakech Street",  Type.Studio, true, true, false, false));
        realEstateCollection.add(new RealEstate("456 Tangier Street",  Type.Studio, false, false, true, true));
        realEstateCollection.add(new RealEstate("234 Rabat Street",  Type.Apartment, true, false, true, true));
            realEstateCollection.displayRealEstates();
            System.out.println("1. Buy Now.");
            System.out.println("2. Enter an Auction.");
            System.out.println("3. Rent.");
            int ok = scanner.nextInt();
            scanner.nextLine(); 
            switch (ok) {
              case 2:
              System.out.println("Enter your information:");
              System.out.print("Name: ");
              String name = scanner.nextLine();
              System.out.print("Address: ");
              String address = scanner.nextLine();
              System.out.print("Phone: ");
              String phone = scanner.nextLine();
              int age = 0;
              boolean validAge = false; 
              
              while (!validAge || age<18) {
                  try {
                      System.out.print("Age: ");
                      age = Integer.parseInt(scanner.nextLine());
                      validAge = true;
                  } catch (NumberFormatException e) {
                      System.out.println("Please enter a valid integer for age.");
                  }
              }
              Bidder bidder = new Bidder(name,address,phone,age);
              Bidder bot1= new Bidder("bot1","1","0661511211",18);
              Bidder bot2 = new Bidder("bot2","2","0661511222",19);
              Bidder bot3 = new Bidder("bot3","3","0661511233",21);
              Bidder bot4 = new Bidder("bot4","4","0661511244",22);
              long currentTimeInMillis = System.currentTimeMillis();
              Date date = new Date(currentTimeInMillis);
                new Auction(date ,100);
                System.out.println("the biding is starting at 100$.");
                System.out.println("enter your bid : ");
                int price = scanner.nextInt();
                scanner.nextLine();
                Auction.placeBid(bidder,price);
                Auction.placeBid(bot1,101);
                Auction.placeBid(bot2,121);
                Auction.placeBid(bot3,131);
                Random rand=new Random();
                Auction.placeBid(bot1,rand.nextInt(110,150));
                Auction.closeAuction();
                break;
            
              default:
                break;
            }


            }
       
        case 4 -> {
            currentUser = null;
            System.out.println("Logged out successfully.");
            break;
            }
        default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
      }
      if(choice != 4){
      AgencyGUI.setChoice(0);
      choice =0;
      }
    }
  }
}
        public static void main(String[] args) {
          App app = new App();
          app.mainmenu();
            
        }
        }