import java.util.*;

public class HerbalEnergy extends SpecialEnergy
{
    
    
    public HerbalEnergy()
    {
        super();
        super.type.add(Type.G);
    }
    

    
    public Effect getEffect()
    {
        return new HerbalEnergyEffect();
    }
    
}
    