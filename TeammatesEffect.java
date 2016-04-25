
public class TeammatesEffect extends SupporterEffect
{
    public TeammatesEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Card[] cards = g.getCurrentPlayer().chooseAnyTwoCardsFromDeck(g);
        for (int i = 0; i < 2; i++)
        {
            g.getCurrentPlayer().getHand().add(g.getCurrentPlayer().getDeck().remove(i));
        }
        
        
    }
}