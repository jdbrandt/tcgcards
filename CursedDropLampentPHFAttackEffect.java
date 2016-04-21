

public class CursedDropLampentPHFAttackEffect extends AttackEffect
{
    public CursedDropLampentPHFAttackEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
       g.getCurrentPlayer().dropNDamageCounters(3);
    }
    
    public int getDamage(Game g)
    {
        return 0;
    }
    
}
        
    
    
   
        
        