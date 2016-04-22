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
    
    public void remove(Game g, Pokemon p)
    {
        p.setCurrentHP(p.getCurrentHP()-20);
    }
    
    public void activate(Game g)
    {
        throw new UnsupportedOperationException();
    }
    
}
        