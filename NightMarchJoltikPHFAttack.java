public class NightMarchJoltikPHFAttack extends Attack
{
    public NightMarchJoltikPHFAttack()
    {
        super();
        requirements.add(Type.C);
        requirements.add(Type.C);
        cloneOriginal();
    }

    public Effect getEffect()
    {
        return new NightMarchJoltikPHFAttackEffect();
    }

        
    

}