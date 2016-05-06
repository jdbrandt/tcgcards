import java.util.*;
public class AcroBikeEffect extends ItemEffect
{
    public AcroBikeEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        
        ArrayList<Card> topCards = (ArrayList) current.deck.subList(0, 2);
        
        current.deck.removeAll(topCards);
        
        Card toHand = current.chooseToHandAcroBike(g, topCards);
        Card toDiscard = null;
        
        for (Card c: topCards)
        {
            if (c != toHand)
            {
                toDiscard = c;
            }
        }
        
        current.hand.add(toHand);
        current.discard.add(toDiscard);
    }
}