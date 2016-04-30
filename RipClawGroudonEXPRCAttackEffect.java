import java.util.*;

public class RipClawGroudonEXPRCAttackEffect extends AttackEffect
{
    public RipClawGroudonEXPRCAttackEffect()
    {
        super();
    }

    public void activate(Game g)
    {
        doActiveDamage(g);
        //flip a coin, if heads...
        if (Math.random() > 0.5)
        {
            ArrayList<Energy> eList = g.getNonCurrentPlayer().getActive().getEnergy();
            if (eList.size() == 1)
            {
                g.getNonCurrentPlayer().getActive().removeEnergy(eList.get(0));
            }
            if (eList.size() > 1)
            {
                Energy energyToRemove = g.getCurrentPlayer().chooseEnergyToDiscardFromActive(g);
                g.getNonCurrentPlayer().getActive().removeEnergy(energyToRemove);
            }
        }
    }

    public int getDamage(Game g)
    {
        return 30;
    }

}

    
        
        