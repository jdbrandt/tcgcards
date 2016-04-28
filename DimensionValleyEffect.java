import java.util.*;

public class DimensionValleyEffect extends StadiumEffect
{
    public DimensionValleyEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {

        
        ArrayList<Pokemon> pList = g.getAllPokemon();
        
        for (Pokemon p : pList)
        {
            if (p.getTypes().contains(Type.P))
            {
                for (Attribute attr : p.getAttributes())
                {
                    if (attr instanceof Attack)
                    {
                        Attack attack = (Attack) attr;
                        attack.getRequirements().remove(Type.C);
                    }
                }
            }
        }
        
        
    }
    
    public void deactivate(Game g)
    {
        ArrayList<Pokemon> pList = g.getAllPokemon();
        
        for (Pokemon p : pList)
        {
            if (p.getTypes().contains(Type.P))
            {
                for (Attribute attr : p.getAttributes())
                {
                    Attack attack = (Attack) attr;
                    if (attack.getOriginal().contains(Type.C))
                    {
                        attack.getRequirements().add(Type.C);
                    }
                }
            }
        }
    }
    
}
        
        