

public class RamPumpkabooPHFAttack extends Attack
{
    public RamPumpkabooPHFAttack()
    {
        super();
        requirements.add(Type.P);
        cloneOriginal();
    }
    
    public Effect getEffect()
    {
        return new RamPumpkabooPHFAttackEffect();
    }
    
}
    