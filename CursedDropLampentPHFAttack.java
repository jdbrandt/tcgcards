

public class CursedDropLampentPHFAttack extends Attack
{
    public CursedDropLampentPHFAttack()
    {
        super();
        requirements.add(Type.P);
        cloneOriginal();
    }
    
    public Effect getEffect()
    {
        return new CursedDropLampentPHFAttackEffect();
    }
    
}
    