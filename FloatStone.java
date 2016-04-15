

public class FloatStone extends Tool
{
    
    public FloatStone()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new FloatStoneEffect();
    }
}
