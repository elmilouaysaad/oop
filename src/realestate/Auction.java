/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;
import user.*;

/**
 *
 * @author mello
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Auction extends Sale {
    private List<Bid> bids;
    private boolean isOpen;

    public Auction(Date date, double startingPrice) {
        super(date, startingPrice);
        this.bids = new ArrayList<>();
        this.isOpen = true;
    }

    public void placeBid(Bidder bidder, double amount) {
        if (isOpen) {
            Bid newBid = new Bid(bidder, amount);
            bids.add(newBid);
        } else {
            System.out.println("Auction is closed. Cannot place a bid.");
        }
    }

    public void closeAuction() {
        isOpen = false;
        // Find the winning bid
        Bid winningBid = findWinningBid();
        if (winningBid != null) {
            // Record the winning bidder
            setWinningBidder(winningBid.getBidder());
        } else {
            System.out.println("No winning bid found. Auction ended without a winner.");
        }
    }

    private Bid findWinningBid() {
        if (bids.isEmpty()) {
            return null;
        }

        Bid winningBid = bids.get(0);
        for (Bid bid : bids) {
            if (bid.getAmount() > winningBid.getAmount()) {
                winningBid = bid;
            }
        }
        return winningBid;
    }

    @Override
    public String getSaleType() {
        return "Auction";
    }

    private void setWinningBidder(Bidder bidder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Bid {
    private Bidder bidder;
    private double amount;

    public Bid(Bidder bidder, double amount) {
        this.bidder = bidder;
        this.amount = amount;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }
}
