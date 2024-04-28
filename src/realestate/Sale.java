/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;

/**
 *
 * @author mello
 */
import java.util.Date;
import user.*;

abstract class Sale {
    final Date date;
    final double price;

    public Sale(Date date, double price) {
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getSaleType();
}
