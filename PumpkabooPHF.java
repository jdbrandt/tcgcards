import java.util.*;

public class PumpkabooPHF extends BasicPokemon
{
    
    public PumpkabooPHF()
    {
        super(60, "Pumpkaboo PHF", new ArrayList<Attribute>(Arrays.asList(new RamPumpkabooPHFAttack(), new NightMarchPumpkabooPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 2, Type.D, Type.F);
    }
    
    public PumpkabooPHF(ArrayList<Pokemon> attachedPokemon)
    {
         super(60, "Pumpkaboo PHF", new ArrayList<Attribute>(Arrays.asList(new RamPumpkabooPHFAttack(), new NightMarchPumpkabooPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 2, Type.D, Type.F, attachedPokemon);
    }
    
    public PumpkabooPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools)
    {
         super(60, "Pumpkaboo PHF", new ArrayList<Attribute>(Arrays.asList(new RamPumpkabooPHFAttack(), new NightMarchPumpkabooPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 2, Type.D, Type.F, attachedPokemon, attachedTools);
    }
    
    public PumpkabooPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools, ArrayList<Energy> attachedEnergy)
    {
         super(60, "Pumpkaboo PHF", new ArrayList<Attribute>(Arrays.asList(new RamPumpkabooPHFAttack(), new NightMarchPumpkabooPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 2, Type.D, Type.F, attachedPokemon, attachedTools, attachedEnergy);
    }
}