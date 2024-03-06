package org.example.design_patterns.behavioual_patterns.mediator_design_pattern.online_auction;

public interface AuctionManager {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder,Integer bidAmount);
}
