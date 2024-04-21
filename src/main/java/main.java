
import realestate.*;
import user.*;


public class main {
    

        public static void main(String[] args) {
            Owner owner = new Owner("John Doe", "123 Main St", "555-1234", 35);

            // Creating a villa owned by the owner
            Villa villa = new Villa("456 Park Ave", owner, true, false, false, false, 4, 1000.0);
    
            // Displaying information about the owner and the villa
            owner.displayInformation();
            System.out.println("Number of rooms in the villa: " + villa.getNumberOfRooms());
            System.out.println("Land area of the villa: " + villa.getLandArea());
    
            // Calculating and displaying the price of the villa
            System.out.println("Price of the villa: $" + villa.calculatePrice());
        }
        }
    
    

