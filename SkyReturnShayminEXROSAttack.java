
public class SkyReturnShayminEXROSAttack extends Attack
{
    
    public SkyReturnShayminEXROSAttack()
    {
        super();
        requirements.add(Type.C);
        requirements.add(Type.C);
        cloneOriginal();
    }
    
    public Effect getEffect()
    {
        return new SkyReturnShayminEXROSAttackEffect();
    }
    
}