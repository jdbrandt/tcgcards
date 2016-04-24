import java.util.*;

public class BasicEnergy extends Energy
{
    
    public BasicEnergy(Type t)
    {
        super();
        super.type.add(t);
    }
    
    

    
    
    public Effect getEffect()
    {
        return new NullEffect();
    }
}