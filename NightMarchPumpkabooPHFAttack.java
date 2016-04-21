

public class NightMarchPumpkabooPHFAttack extends Attack
{
    public NightMarchPumpkabooPHFAttack()
    {
        super();
        requirements.add(Type.C);
        requirements.add(Type.C);
        requirements.add(Type.C);
    }
    
    public Effect getEffect()
    {
        return new NightMarchPumpkabooPHFAttackEffect();
    }
    
}
    