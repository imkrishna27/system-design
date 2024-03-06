package org.example.design_patterns.behavioual_patterns.mediator_design_pattern.online_auction;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IPLAuction implements AuctionManager{

    List<Bidder> bidderList = new ArrayList<>();

    @Override
    public void addBidder(Bidder bidder) {
        this.bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, Integer bidAmount) {
        for(Bidder b: bidderList) {
            if(!bidder.getName().equals(b.getName())) {
                b.receiveBidNotification(bidAmount,bidder);
            }
        }
    }
}
