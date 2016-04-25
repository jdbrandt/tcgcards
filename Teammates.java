
public class Teammates extends Supporter
{
    public Teammates()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new TeammatesEffect();
    }
    
}