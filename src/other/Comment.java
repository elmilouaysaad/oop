/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package other;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mello
 */
public class Comment implements Serializable {
    private String comments;
    private Date date;


    public Comment(String comments, Date date) {
        this.comments = comments;
        this.date = date;
       
    }
    public Comment(String comments) {
        this.comments = comments;
      
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }
   

    public void setDate(Date date) {
        this.date = date;
    }
}