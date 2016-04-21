

public class RamPumpkabooPHFAttack extends Attack
{
    public RamPumpkabooPHFAttack()
    {
        super();
        requirements.add(Type.P);
    }
    
    public Effect getEffect()
    {
        return new RamPumpkabooPHFAttackEffect();
    }
    
}
    