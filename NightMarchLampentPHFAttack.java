

public class NightMarchLampentPHFAttack extends Attack
{
    public NightMarchLampentPHFAttack()
    {
        super();
        requirements.add(Type.P);
        requirements.add(Type.C);
        requirements.add(Type.C);
        cloneOriginal();
    }
    
    public Effect getEffect()
    {
        return new NightMarchLampentPHFAttackEffect();
    }
    
}
    