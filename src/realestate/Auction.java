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

public class Auction extends Sale {
    private static List<Bid> bids;
    private static boolean isOpen;

    public Auction(Date date, double startingPrice) {
        super(date, startingPrice);
        bids = new ArrayList<>();
        isOpen = true;
    }

    public static void placeBid(Bidder bidder, double amount) {
        if (isOpen) {
            Bid newBid = new Bid(bidder, amount);
            bids.add(newBid);
        } else {
            System.out.println("Auction is closed. Cannot place a bid.");
        }
    }

    public static void closeAuction() {
        isOpen = false;
        // Find the winning bid
        Bid winningBid = findWinningBid();

        if (winningBid != null) {
            // Record the winning bidder
            System.out.println("the winning bidder is "+ winningBid.getBidder().getName());
        } else {
            System.out.println("No winning bid found. Auction ended without a winner.");
        }
    }

    private static Bid findWinningBid() {
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

}

