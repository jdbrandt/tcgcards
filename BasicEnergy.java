import java.util.*;

public class BasicEnergy extends Energy
{
    private Type t;
    
    public BasicEnergy(Type t)
    {
        super();
        
    }
    
    
    public ArrayList<Type> getType()
    {
        ArrayList<Type> tempArr = new ArrayList<Type>();
        tempArr.add(t);
        return tempArr;
        
    }
    
    
    public Effect getEffect()
    {
        return new NullEffect();
    }
}