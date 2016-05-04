

public class BattleCompressorEffect extends ItemEffect
{
    public BattleCompressorEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        g.getCurrentPlayer().setCanKnowDeck(true);
        Card[] cards = g.getCurrentPlayer().chooseCardsToDiscardFromDeck(3);
        
        for (int i = 0; i < 3; i++)
        {
            g.getCurrentPlayer().getDiscard().add(g.getCurrentPlayer().getDeck().remove(i));
        }
        
        g.getCurrentPlayer().setCanKnowDeck(false);
    }
}