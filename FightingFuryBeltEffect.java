
public class FightingFuryBeltEffect extends ToolEffect
{
    public FightingFuryBeltEffect()
    {
        super();
    }
    
    public void activate(Game g, Pokemon p)
    {
        p.setMaxHP( p.getMaxHP() + 40 );
        p.setCurrentHP( p.getCurrentHP() + 40 );
        p.setDamageMod( p.getDamageMod() + 10 );
    }
    
    public void deactivate(Game g, Pokemon p)
    {
        p.setMaxHP( p.getMaxHP() - 40 );
        p.setCurrentHP( p.getCurrentHP() + 40 );
        p.setDamageMod( p.getDamageMod() - 10 );
    }
    
    public void activate(Game g)
    {
        throw new UnsupportedOperationException();
    }
}