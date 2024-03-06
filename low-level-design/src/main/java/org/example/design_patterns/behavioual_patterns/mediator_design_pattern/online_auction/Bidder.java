package org.example.design_patterns.behavioual_patterns.mediator_design_pattern.online_auction;

public interface Bidder {
    void placeBid(Integer amount);
    String getName();
    void receiveBidNotification(Integer bidAmount,Bidder bidder);
}
