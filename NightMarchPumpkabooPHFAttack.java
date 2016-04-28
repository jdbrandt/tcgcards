

public class NightMarchPumpkabooPHFAttack extends Attack
{
    public NightMarchPumpkabooPHFAttack()
    {
        super();
        requirements.add(Type.C);
        requirements.add(Type.C);
        requirements.add(Type.C);
        cloneOriginal();
    }
    
    public Effect getEffect()
    {
        return new NightMarchPumpkabooPHFAttackEffect();
    }
    
}
    