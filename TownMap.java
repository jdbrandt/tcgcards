
public class TownMap extends Item
{
    public TownMap()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new TownMapEffect();
    }
}