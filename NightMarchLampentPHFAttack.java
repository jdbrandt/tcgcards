

public class NightMarchLampentPHFAttack extends Attack
{
    public NightMarchLampentPHFAttack()
    {
        super();
        requirements.add(Type.P);
        requirements.add(Type.C);
        requirements.add(Type.C);
    }
    
    public Effect getEffect()
    {
        return new NightMarchLampentPHFAttackEffect();
    }
    
}
    