

public class XerosicEffect extends SupporterEffect
{
    public Xerosic()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer()
        Player opponent = g.getNonCurrentPlayer();
        Card cardToDiscard = current.chooseToolOrSpecialEnergyToDiscard(g);
        if (cardToDiscard instanceof Tool)
        {
            if (current.getActive().getTools().contains(cardToDiscard))
            {
                current.getActive().getTools().remove(cardToDiscard);
            }
            else if (opponent.getActive().getTools().contains(CardToDiscard))
            {
                opponent.getActive().getTools().remove(cardToDiscard);
            }
            for (Pokemon p : current.getBench())
            {
                if (p.
            
            
            
            