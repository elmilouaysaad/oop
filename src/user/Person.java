/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mello
 */

public abstract class Person extends User {
    private String name;
    private String address;
    private String phone;
    private int age;

    // Constructor
    public Person(String name, String address, String phone, int age, String username, String password) {
        super(username, password); // Call the constructor of the superclass (User)
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }
  

    // Getters and setters for additional attributes specific to Person
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to display information
    public abstract void displayInformation();
}
