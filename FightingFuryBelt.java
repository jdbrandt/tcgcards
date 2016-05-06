
public class FightingFuryBelt extends Tool
{
    public FightingFuryBelt()
    {
        super();
    }
    
    public Effect getEffect()
    {
        return new FightingFuryBeltEffect();
    }
}