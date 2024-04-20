/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mello
 */
import java.util.Date;

import java.util.Date;

public class Buyer {
    private String name;
    private int age;
    private Date dateOfBirth;

    public Buyer(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        calculateAge();
    }

    private void calculateAge() {
        // Calculating age based on date of birth
        Date currentDate = new Date();
        long timeDifferenceInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long yearsInMillis = 1000L * 60 * 60 * 24 * 365;
        age = (int) (timeDifferenceInMillis / yearsInMillis);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        calculateAge();
    }

    public void verifyAge() throws UnderAgeException {
        // Verify if the buyer is over 18
        if (age < 18) {
            throw new UnderAgeException("Buyer is under 18 years old.");
        }
    }

    public static void main(String[] args) {
        // Example usage with try-catch block
        Buyer buyer = new Buyer("John Doe", new Date(2005, 0, 1)); // Assuming John Doe was born on Jan 1, 2005
        try {
            buyer.verifyAge();
            System.out.println("Buyer is over 18.");
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
            // Handle the exception here
        }
    }
}

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

