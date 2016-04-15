import java.util.*;

public class HerbalEnergy extends SpecialEnergy
{
    private final Type t = Type.G;
    
    public HerbalEnergy()
    {
        
    }
    
    public ArrayList<Type> getType()
    {
        ArrayList<Type> tempArr = new ArrayList<Type>();
        tempArr.add(t);
        return tempArr;
        
    }
    
    public Effect getEffect()
    {
        return new HerbalEnergyEffect();
    }
    
}
    