import java.util.*;

public class RipClawGroudonEXPRCAttack extends Attack
{
    ArrayList<Type> requirements;
    
    public RipClawGroudonEXPRCAttack()
    {
        super();
        requirements.add(Type.F);
        requirements.add(Type.C);
        
    }
    
    public Effect getEffect()
    {
        return new RipClawGroudonEXPRCAttackEffect();
    }
    
    
    
}
