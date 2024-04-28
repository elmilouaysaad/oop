/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package other;
import user.*;
import realestate.*;
/**
 *
 * @author mello
 */
import java.util.Date;

public class Interaction {
    private Date date;
    private String description;
    private RealEstate realEstate;
    private Person[] participants;
    private String[] comments;

    public Interaction(Date date, String description, RealEstate realEstate, Person[] participants) {
        this.date = date;
        this.description = description;
        this.realEstate = realEstate;
        this.participants = participants;
        this.comments = new String[0]; 
    }
    public Interaction(Date date, String description,  Person[] participants) {
        this.date = date;
        this.description = description;
        this.participants = participants;
        this.comments = new String[0]; 
    }
    // Getter and setter methods for date, description, realEstate, and participants

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public Person[] getParticipants() {
        return participants;
    }

    public void setParticipants(Person[] participants) {
        this.participants = participants;
    }

    // Method to add a comment to the interaction
    public void addComment(String comment) {
        // Expand the comments array to fit the new comment
        String[] newComments = new String[comments.length + 1];
        System.arraycopy(comments, 0, newComments, 0, comments.length);
        newComments[comments.length] = comment;
        comments = newComments;
    }

    // Method to retrieve all comments for the interaction
    public String[] getComments() {
        return comments;
    }
}
