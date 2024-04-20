/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mello
 */
public class Bidder {
    private String name;
    private int age;

 
   public Bidder(String name, int age) {
        this.name = name;
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Bidder must be over 18 to participate in auctions.");
            }
            this.age = age;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            this.age = -1;
        }
    }

public void placeBid(double amount) {
        if (age >= 18) {
            System.out.println(name + " placed a bid of $" + amount);
            // Additional logic for placing bid
        } else {
            System.out.println(name + " is not qualified to participate in the auction.");
        }
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

    public void setAge(int age) {
        this.age = age;
    }

}
