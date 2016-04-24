import java.util.*;
public class ShayminEX extends EXPokemon
{
    public ShayminEX()
    {
        super(110, "Shaymin-EX PRC", new ArrayList<Attribute>(Arrays.asList(new SetUpShayminEXROSAbility(), new SkyReturnShayminEXROSAttack())),new ArrayList<Type>(Arrays.asList(Type.C)), 1, Type.L, Type.F);
    }
    
    public ShayminEX(ArrayList<Pokemon> attachedPokemon)
    {
        super(110, "Shaymin-EX PRC", new ArrayList<Attribute>(Arrays.asList(new SetUpShayminEXROSAbility(), new SkyReturnShayminEXROSAttack())),new ArrayList<Type>(Arrays.asList(Type.C)), 1, Type.L, Type.F, attachedPokemon);
    }
    
    public ShayminEX(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools)
    {
        super(110, "Shaymin-EX PRC", new ArrayList<Attribute>(Arrays.asList(new SetUpShayminEXROSAbility(), new SkyReturnShayminEXROSAttack())),new ArrayList<Type>(Arrays.asList(Type.C)), 1, Type.L, Type.F, attachedPokemon, attachedTools);
    }
    
    public ShayminEX(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools, ArrayList<Energy> attachedEnergy)
    {
        super(110, "Shaymin-EX PRC", new ArrayList<Attribute>(Arrays.asList(new SetUpShayminEXROSAbility(), new SkyReturnShayminEXROSAttack())),new ArrayList<Type>(Arrays.asList(Type.C)), 1, Type.L, Type.F, attachedPokemon, attachedTools, attachedEnergy);
    }
    
    
        
}