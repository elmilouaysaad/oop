package realestate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import other.Comment;

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
    public void modify(int index, Comment newComment) {
        if (index >= 0 && index < realEstates.size()) {
            RealEstate realEstate = realEstates.get(index);
            realEstate.getComments().add(newComment);
            realEstates.set(index, realEstate);
            System.out.println("Comment appended successfully.");
        } else {
            System.out.println("Index out of bounds.");
        }
    }
    public void sortRealEstates(Comparator<RealEstate> comparator) {
        if (comparator == null) {
            comparator = new RealEstateTypeComparator();
        }
        realEstates.sort(comparator);
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"))) {
            oos.writeObject(realEstates);
            System.out.println(" data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<RealEstate> loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"))) {
            realEstates = (List<RealEstate>) ois.readObject();
            System.out.println(" data loaded successfully.");
            return realEstates;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data to file: " + e.getMessage());
        }
        return null;
    }
}

