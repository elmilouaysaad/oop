/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author mello
 */
public class Owner {
    private String name;
    private String contactInfo;

    // Constructor
    public Owner(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Other methods as needed
}

