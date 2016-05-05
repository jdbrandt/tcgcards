

public class BattleCompressorEffect extends ItemEffect
{
    public BattleCompressorEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
<<<<<<< HEAD
        g.getCurrentPlayer().setCanKnowDeck(true);
        Card[] cards = g.getCurrentPlayer().chooseCardsToDiscardFromDeck(3);
=======
        Card[] cards = g.getCurrentPlayer().chooseCardsToDiscardFromDeck(g, 3);
>>>>>>> origin/master
        
        for (int i = 0; i < 3; i++)
        {
            g.getCurrentPlayer().getDiscard().add(g.getCurrentPlayer().getDeck().remove(i));
        }
        
        g.getCurrentPlayer().setCanKnowDeck(false);
    }
}