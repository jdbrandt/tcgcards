import java.util.*;

public class GroudonEXPRC extends EXPokemon
{
    public GroudonEXPRC()
    {
        super(180, "Groudon-EX PRC", ArrayList<Attribute>(Arrays.asList(RipClawGroudonEXAttack, MassiveRendGroudonEXAttack)), ArrayList<Type>(Arrays.asList(Type.F)), 4, Type.G, Type.L);
    }
    
    public GroudonEXPRC(ArrayList<Pokemon> attachedPokes)
    {
        super(180, "Groudon-EX PRC", ArrayList<Attribute>(Arrays.asList(RipClawGroudonEXAttack, MassiveRendGroudonEXAttack)), ArrayList<Type>(Arrays.asList(Type.F)), 4, Type.G, Type.L, attachedPokes);
    }
    
    public GroudonEXPRC(ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        super(180, "Groudon-EX PRC", ArrayList<Attribute>(Arrays.asList(RipClawGroudonEXAttack, MassiveRendGroudonEXAttack)), ArrayList<Type>(Arrays.asList(Type.F)), 4, Type.G, Type.L, attachedPokes, ts);
    }
    
    public GroudonEXPRC(ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Energy> attachedE)
    {
        super(180, "Groudon-EX PRC", ArrayList<Attribute>(Arrays.asList(RipClawGroudonEXAttack, MassiveRendGroudonEXAttack)), ArrayList<Type>(Arrays.asList(Type.F)), 4, Type.G, Type.L, attachedPokes, ts, attachedE);
    }
    
    
    
}