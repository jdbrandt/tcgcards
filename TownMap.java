
public class TownMap extends Item
{
    public TownMap()
    {
        super();
    }
    
    public Effect getEffect()
    {
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
        return new TownMapEffect();
    }
}