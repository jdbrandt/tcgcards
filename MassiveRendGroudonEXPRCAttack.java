import java.util.*;

public class MassiveRendGroudonEXPRCAttack extends Attack
{
    public MassiveRendGroudonEXPRCAttack()
    {
        super();
        requirements.addAll(new ArrayList<Type>(Arrays.asList(Type.F, Type.F, Type.F, Type.C)));
    }
    
    public Effect getEffect()
    {
        return new MassiveRendGroudonEXPRCAttackEffect();
    }
    
}
    