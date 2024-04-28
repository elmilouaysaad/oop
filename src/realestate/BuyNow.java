package realestate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mello
 */
import java.util.Date;
import user.Buyer;


class BuyNow extends Sale {
    private Buyer buyer;
    private RealEstate realEstate;

    public BuyNow(Date date, double price, Buyer buyer, RealEstate realEstate) {
        super(date, price);
        this.buyer = buyer;
        this.realEstate = realEstate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    
    @Override
    public String getSaleType() {
        return "Buy Now";
    }

}
