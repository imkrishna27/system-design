package org.example.design_patterns.behavioual_patterns.mediator_design_pattern.online_auction;

public class Franchise implements Bidder {
    private AuctionManager auctionManager;

    private String franchiseName;

    public Franchise(AuctionManager auctionManager,String franchiseName) {
        this.auctionManager = auctionManager;
        this.franchiseName = franchiseName;
        // add current franchise to bidding list
        this.auctionManager.addBidder(this);
    }
    @Override
    public void placeBid(Integer amount) {
        this.auctionManager.placeBid(this,amount);
    }

    @Override
    public String getName() {
        return this.franchiseName;
    }

    // this option will be helpful when some other franchise bit you will be notified
    @Override
    public void receiveBidNotification(Integer bidAmount,Bidder bidder) {
        System.out.println(this.franchiseName + " : " + bidder.getName() + " had placed a bid of "+ bidAmount);
    }
}
