

public class NightMarchPumpkabooPHFAttackEffect extends AttackEffect
{
    public NightMarchPumpkabooPHFAttackEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
       doActiveDamage(g);
    }
    
    public int getDamage(Game g)
    {
        Player p = g.getCurrentPlayer();
        
        int numNightMarchersInDiscard = 0;
        
        for (Card c : p.getDiscard())
        {
            if (c instanceof JoltikPHF || c instanceof PumpkabooPHF || c instanceof LampentPHF)
            {
                numNightMarchersInDiscard++;
            }
        }
        
        return numNightMarchersInDiscard*20;
    }
    
}
        
    
    
   
        
        