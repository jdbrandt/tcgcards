
public class AcroBike extends Item
{
    public AcroBike()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new AcroBikeEffect();
    }
}