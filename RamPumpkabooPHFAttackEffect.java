

public class RamPumpkabooPHFAttackEffect extends AttackEffect
{
    public RamPumpkabooPHFAttackEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
       doActiveDamage(g);
    }
    
    public int getDamage(Game g)
    {
        return 10;
    }
    
}
        
    
    
   
        
        