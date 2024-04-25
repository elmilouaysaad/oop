package realestate;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RealEstateCollection {
    private static List<RealEstate> realEstates;

    public RealEstateCollection() {
        RealEstateCollection.realEstates = new ArrayList<>();
    }

    public void add(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public void modify(int index, RealEstate modifiedRealEstate) {
        if (index >= 0 && index < realEstates.size()) {
            realEstates.set(index, modifiedRealEstate);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < realEstates.size()) {
            realEstates.remove(index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
    public void displayRealEstates() {
        System.out.println("Real Estates:");
        for (RealEstate realEstate : realEstates) {
            System.out.println(realEstate.toString());
        }
    }

    public static List<RealEstate> searchByType(Class<? extends RealEstate> type) {
        List<RealEstate> result = new ArrayList<>();
        for (RealEstate realEstate : realEstates) {
            if (type.isInstance(realEstate)) {
                result.add(realEstate);
            }
        }
        return result;
    }

   
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/dressup.ser"))) {
            oos.writeObject(realEstates);
            System.out.println("Cloth data saved successfully.");
        } catch (IOException e) {
            
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/dressup.ser"))) {
            realEstates = (List<RealEstate>) ois.readObject();
            System.out.println("Cloth data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {

        }
    }
}

