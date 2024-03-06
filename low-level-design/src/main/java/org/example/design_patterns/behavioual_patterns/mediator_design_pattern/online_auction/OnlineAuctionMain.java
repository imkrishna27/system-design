package org.example.design_patterns.behavioual_patterns.mediator_design_pattern.online_auction;

public class OnlineAuctionMain {
    public static void main(String[] args) {
        AuctionManager iplAuction = new IPLAuction();
        // Register all franchise
        Franchise franchise1 = new Franchise(iplAuction,"Chennai Super Kings");
        Franchise franchise2 = new Franchise(iplAuction,"Mumbai Indians");
        Franchise franchise3 = new Franchise(iplAuction,"Royal Challengers Bangalore");
        Franchise franchise4 = new Franchise(iplAuction,"Delhi Capitals");
        franchise1.placeBid(1000);
        franchise3.placeBid(9000);
    }
}
