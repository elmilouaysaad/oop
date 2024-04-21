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

class BuyNowSale extends Sale {
    private Buyer buyer;

    public BuyNowSale(Date date, double price, Buyer buyer) {
        super(date, price);
        this.buyer = buyer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    @Override
    public String getSaleType() {
        return "Buy Now";
    }
}

class AuctionSale extends Sale {
    private Bidder winningBidder;

    public AuctionSale(Date date, double price, Bidder winningBidder) {
        super(date, price);
        this.winningBidder = winningBidder;
    }

    public Bidder getWinningBidder() {
        return winningBidder;
    }

    @Override
    public String getSaleType() {
        return "Auction";
    }
}
