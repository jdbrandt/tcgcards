

public class NightMarchJoltikPHFAttack extends Attack
{
    public NightMarchJoltikPHFAttack()
    {
        super();
        super.requirements.add(Type.C);
        super.requirements.add(Type.C);
    }
    
    public Effect getEffect()
    {
        return new NightMarchJoltikPHFAttackEffect();
    }
    
}
    