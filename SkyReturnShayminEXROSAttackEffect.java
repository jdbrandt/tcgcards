
public class SkyReturnShayminEXROSAttackEffect extends AttackEffect
{
    
    public SkyReturnShayminEXROSAttackEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        doActiveDamage(g);
        g.getCurrentPlayer().scoopUp(g, g.getCurrentPlayer().getActive());
    }
    
    public int getDamage(Game g)
    {
        return 30;
    }
    
    }
    
    