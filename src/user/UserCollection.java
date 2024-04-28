package user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author mello
 */

public class UserCollection {
    private List<User> users;

    // Constructor
    public UserCollection() {
        users = new ArrayList<>();
    }

    // Method to add a user to the collection
    public void addUser(User user) {
        users.add(user);
    }

    // Method to remove a user from the collection
    public void removeUser(User user) {
        users.remove(user);
    }

    // Method to check if a username exists in the collection
    public boolean usernameExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void sortUsersByUsername() {
        Collections.sort(users, Comparator.comparing(User::getUsername));
    }

    // Method to authenticate a user given a username and password
    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.authenticate(username, password)) {
                return true;
            }
        }
        return false;
    }

    // Method to change the password of a user given the username and new password
    public void changePassword(String username, String newPassword) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.changePass(newPassword);
                return;
            }
        }
        System.out.println("User not found.");
    }

    // Method to reset the password of a user given the username
    public void resetPassword(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.resetPass();
                return;
            }
        }
        System.out.println("User not found.");
    }
       public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("User.ser"))) {
            oos.writeObject(users);
            System.out.println(" data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("User.ser"))) {
            users = (List<User>) ois.readObject();
            System.out.println(" data loaded successfully.");
            return users;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data to file: " + e.getMessage());
        }
        return null;
    }
}

