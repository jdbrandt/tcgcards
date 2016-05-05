

public class VSSeekerEffect extends ItemEffect
{
    
    public VSSeekerEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player current = g.getCurrentPlayer();
        Supporter s = current.cardToVSSeeker(g);
        current.discard.remove(s);
        current.hand.add(s);
    }
}
        