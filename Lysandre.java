
public class Lysandre extends Supporter
{
    public Lysandre()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new LysandreEffect();
    }
    
}