

public class BattleCompressorEffect extends ItemEffect
{
    public BattleCompressorEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Card[] cards = g.getCurrentPlayer().chooseCardsToDiscardFromDeck(g, 3);
        
        for (int i = 0; i < 3; i++)
        {
            g.getCurrentPlayer().getDiscard().add(g.getCurrentPlayer().getDeck().remove(i));
        }
    }
}