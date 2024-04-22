package realestate;

import user.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VillaCollection {
    private static List<Villa> villas;

    public VillaCollection() {
        this.villas = new ArrayList<>();
    }

    public void addVilla(Villa villa) {
        villas.add(villa);
    }

    public void modifyVilla(int index, Villa modifiedVilla) {
        if (index >= 0 && index < villas.size()) {
            villas.set(index, modifiedVilla);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void removeVilla(int index) {
        if (index >= 0 && index < villas.size()) {
            villas.remove(index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // Method to search villas by type
    public List<Villa> searchByType(Class<? extends Villa> type) {
        List<Villa> result = new ArrayList<>();
        for (Villa villa : villas) {
            if (type.isInstance(villa)) {
                result.add(villa);
            }
        }
        return result;
    }

    // Method to sort villas by price
    public void sortByPrice() {
        villas.sort(Comparator.comparingDouble(Villa::calculatePrice));
    }

    // Method to save villas to a file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/villas.ser"))) {
            oos.writeObject(villas);
            System.out.println("Villas data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    public static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/villas.ser"))) {
            villas = (List<Villa>) ois.readObject();
            System.out.println("Villas data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
  
    // Method to print all villas
    public static void printAllVillas() {
        if (villas.isEmpty()) {
            System.out.println("No villas found.");
            return;
        }

        System.out.println("=== Villas ===");
        for (int i = 0; i < villas.size(); i++) {
            Villa villa = villas.get(i);
            System.out.println("Index: " + i);
            System.out.println("Address: " + villa.getAddress());
            System.out.println("Number of Rooms: " + villa.getNumberOfRooms());
            System.out.println("Land Area: " + villa.getLandArea() + " sq. meters");
            // Print other relevant information about the villa
            System.out.println();
        }
    }
   
    public static void printAvailableForRentVillas() {
        boolean found = false;
        for (Villa villa : villas) {
            if (villa.ForRent()) {
                System.out.println("=== Available Villa For Rent ===");
                System.out.println("Address: " + villa.getAddress());
                System.out.println("Number of Rooms: " + villa.getNumberOfRooms());
                System.out.println("Land Area: " + villa.getLandArea() + " sq. meters");
                System.out.println("Price: " + villa.calculatePrice());
                // Print other relevant information about the villa
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No villas available for rent.");
        }
    }
}
