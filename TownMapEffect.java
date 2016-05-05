public class TownMapEffect extends ItemEffect
{
    public TownMapEffect()
    {
        super();
    }

    public void activate(Game g)
    {
        g.getCurrentPlayer().setCanKnowPrizes(true);
    }
}