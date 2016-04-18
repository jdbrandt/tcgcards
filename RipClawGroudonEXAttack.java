import java.util.*;

public class RipClawGroudonEXAttack
{
    ArrayList<Type> requirements;
    
    public RipClawGroudonEXAttack()
    {
        super();
        requirements.add(Type.F);
        requirements.add(Type.C);
        
    }
    
    public Effect getEffect()
    {
        return new RipClawGroudonEXAttackEffect();
    }
    
    
    
}
