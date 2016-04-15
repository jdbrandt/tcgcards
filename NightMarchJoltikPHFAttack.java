

public class NightMarchJoltikPHFAttack extends Attack
{
    public NightMarchJoltikPHFAttack()
    {
        super();
        requirements.add(Type.L);
    }
    
    public Effect getEffect()
    {
        return new NightMarchJoltikPHFAttackEffect();
    }
    
}
    