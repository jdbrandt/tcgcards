
public class EscapeRope extends Item

{
    public EscapeRope()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new EscapeRopeEffect();
    }
}