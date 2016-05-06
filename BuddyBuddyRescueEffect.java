

public class BuddyBuddyRescueEffect extends ItemEffect
{
    public BuddyBuddyRescueEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        Player opponent = g.getNonCurrentPlayer();
        
        Pokemon oppPoke = opponent.chooseBuddyBuddy(g);
        Pokemon currPoke = current.chooseBuddyBuddy(g);
        
        opponent.getDiscard().remove(oppPoke);
        opponent.getHand().add(oppPoke);
        
        current.getDiscard().remove(currPoke);
        current.getHand().add(currPoke);
    }
    
}