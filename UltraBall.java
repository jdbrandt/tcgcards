
public class UltraBall extends Item
{
    public UltraBall()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new UltraBallEffect();
    }
}
