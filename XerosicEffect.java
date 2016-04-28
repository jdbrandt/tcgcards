

public class XerosicEffect extends SupporterEffect
{
    public XerosicEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        Player opponent = g.getNonCurrentPlayer();
        
        Card[] cards = current.chooseToolOrSpecialEnergyToDiscard(g);
        
        Pokemon p = (Pokemon) cards[0];
        Card cardToRemove = cards[1];
        
        if (p.getTools().contains(cardToRemove))
        {
            p.getTools().remove(cardToRemove);
        }
        else
        {
            p.getEnergy().remove(cardToRemove);
        }
    }
}
        