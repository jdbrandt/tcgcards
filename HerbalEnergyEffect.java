import java.util.*;

public class HerbalEnergyEffect extends SpecialEnergyEffect
{
    
    public HerbalEnergyEffect()
    {
        super();
    }
    
    //called when herbalenergy is put into play
    public void activate(Game g, Pokemon p)
    {
        p.setCurrentHP(p.getCurrentHP()+20);
    }
    
    public void deactivate(Game g, Pokemon p)
    {
    }
    
    public void activate(Game g)
    {
        throw new UnsupportedOperationException();
    }
    
}
        