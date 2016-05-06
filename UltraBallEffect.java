
public class UltraBallEffect extends ItemEffect
{
    public UltraBallEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        
        current.setCanKnowDeck(true);
        
        Card[] toDiscard = current.chooseUltraBallAway(g);
        
        for (Card c: toDiscard)
        {
            current.hand.remove(c);
            current.discard.add(c);
        }
        
        Pokemon mon = current.chooseUltraBall(g);
        
        current.deck.remove(mon);
        current.hand.add(mon);
        
        current.setCanKnowDeck(false);
    }
}
        
            