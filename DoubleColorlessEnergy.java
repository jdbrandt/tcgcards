

public class DoubleColorlessEnergy extends SpecialEnergy
{
    public DoubleColorlessEnergy()
    {
        super();
        super.type.add(Type.C);
        super.type.add(Type.C);
    }
    
    public Effect getEffect()
    {
        return new NullEffect();
    }
    
}
    