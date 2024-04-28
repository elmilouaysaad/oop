import java.sql.Date;
import java.util.*;

/**
 *
 * @author mello
 */

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
    private Type type;
  

    public App(){

        this.Preson = new ArrayList<>();
        this.Users = new ArrayList<>();
        this.RealEstate = new ArrayList<>();
        this.Users = new ArrayList<>();
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
    RealEstateCollection realEstateCollection = new RealEstateCollection();
    UserCollection User = new UserCollection();
    
    RealEstate.addAll(realEstateCollection.loadFromFile());   
    Users.addAll( User.loadFromFile());
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
          User.addUser(newUser);
          User.saveToFile();
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
            System.out.println("2. interract with a potential Buyer.");
            System.out.println("3. Go back");
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
              System.out.println(" Which Houskeeper do you want to assign to. " + realEstate.getType()+ " on " +realEstate.getAddress());
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
                case 3:
                    exit = true;
                    System.out.println("Going back...");
                    break;
                    case 2:
                   // RealEstate realEstate1 = new RealEstate("567 Ifrane Street",  Type.Villa, false, true, false, true);            
                    Person[] participants = new Person[2];
                    participants[0] = new Buyer("Ahmed", "456 Fes St", "06555678", 30);
                    participants[1] = manager;
            
                    // do the interaction
                    Date date = new Date(System.currentTimeMillis()); 
                    String description = "Meeting to discuss property details";
                    Interaction interaction = manager.interact(date, description, participants);
            
                    // Display interaction details
                    System.out.println("Interaction Details:");
                    System.out.println("Date: " + interaction.getDate());
                    System.out.println("Description: " + interaction.getDescription());
                    System.out.println("Participants:");
                    for (Person participant : interaction.getParticipants()) {
                        System.out.println("- " + participant.getName());
                    }
                    System.out.println("Real Estate: " + interaction.getRealEstate().getAddress());
                  
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
              System.out.println("2. add a new Proprety.");
              System.out.println("3. Go back");
              System.out.print("Enter your choice: ");
              int nm = scanner.nextInt();
              scanner.nextLine(); 

            

              switch (nm) {
                  case 1:
                     
        
                    realEstateCollection.displayRealEstates();
                      break;   
                  case 2:
                  System.out.println("Adding a new property...");
    System.out.print("Enter the address: ");

    String address1 = scanner.nextLine();
    boolean validInput = false;
    Type type = null;
    System.out.print("Enter property type (Villa, Apartment,Commercial, Studio): ");
    String typeInput = scanner.nextLine();
    while (!validInput) {
      try {
          type = Type.valueOf(typeInput); 
          validInput = true;
      } catch (IllegalArgumentException e) {
          System.out.println("Invalid property type. Please enter one of: Villa, Apartment, Studio.");
          System.out.print("Enter property type (Type one of the following: Villa, Apartment, Studio): ");
          typeInput = scanner.nextLine();
      }
  }
    System.out.print("Is the property for sale? (Type one of the following: true/false): ");
    boolean forSale = scanner.nextBoolean();
    System.out.print("Is the property for rent? (Type one of the following: true/false): ");
    boolean forRent = scanner.nextBoolean();
    
    boolean shortTerm = false;
    boolean longTerm = false;

    if (forRent) {
        System.out.print("Is the property available for short term rent? (true/false): ");
        shortTerm = scanner.nextBoolean();
        System.out.print("Is the property available for long term rent? (true/false): ");
        longTerm = scanner.nextBoolean();
    }
    scanner.nextLine();
    
    RealEstate newProperty = new RealEstate(address1, owner, type, forSale, forRent, shortTerm, longTerm);
       
    
    realEstateCollection.add(newProperty);
    realEstateCollection.sortRealEstates(null); 

    System.out.println("Property added and sorted by type successfully!");
    realEstateCollection.saveToFile();
    realEstateCollection.displayRealEstates();


                  break;                 
                  case 3:
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
       
            realEstateCollection.displayRealEstates();
         
            System.out.println("Press 1 to Enter an Auction.");
            System.out.println("Press 2 to Comment on a proprety .");
            System.out.println("Press 3 to View past Comments on a proprety .");
            System.out.println("Press 4 to Return.");

         
            int ok = scanner.nextInt();
            scanner.nextLine(); 
            switch (ok) {
              case 1:
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
                Auction.placeBid(bot4,rand.nextInt(110,150));
                Auction.closeAuction();
                break;
            case 2:
           System.out.println("Which RealEstate would you like to comment on. ");                 
            boolean validInput=false;
            int size=RealEstate.size();
            int x=0;
            while (!validInput || x < 1 || x > size) {
              try {
                  x = Integer.parseInt(scanner.nextLine());
                  if (x < 1 || x > size) {
                      System.out.println("Invalid input. Please provide a valid integer index within the range.");
                  } else {
                      validInput = true;
                  }
              } catch (NumberFormatException e) {
                  System.out.println("Invalid input. Please provide a valid integer index.");
              }
          }
          System.out.println("Enter your comment:");                 
          String commentText = scanner.nextLine();
          // create an new comment object 
          Comment comment = new Comment(commentText);
         
          // add it to the realestate chosen within the list
         // RealEstate.get(x-1).setComments(comments);
          // add it to the collection so it can get serialized
          
          realEstateCollection.modify(x-1, comment);
          realEstateCollection.saveToFile();       
          System.out.println("the following comment has been left on the Proprety:");
          System.out.println(comment.getComments());
          
            break;
            
            case 3:
            System.out.println("Which RealEstate would you like to see its comments. ");                 
            int z =scanner.nextInt();
            scanner.nextLine();

            // checks is the list comment is empty
              if (RealEstate.get(z-1).getComments().isEmpty()) {
                    System.out.println("This RealEstate has no comments.");
              } else {
                    System.out.println("Comments for RealEstate :");
                    int i = 0;
                    //prints the comments left on the chosen RE
                 while (i < RealEstate.get(z-1).getComments().size()) {
                
                System.out.println(RealEstate.get(z-1).getComments().get(i).getComments());
                i++;

                 
                  }
              }
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