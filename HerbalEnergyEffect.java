import java.util.*;

public class HerbalEnergyEffect extends SpecialEnergyEffect
{
    
    public HerbalEnergyEffect()
    {
        super();
    }
    
    //called when herbalenergy is put into play
    public void activate(Object o)
    {
        Pokemon p = (Pokemon) o;
        p.setCurrentHP(p.getCurrentHP()+20);
    }
}
        