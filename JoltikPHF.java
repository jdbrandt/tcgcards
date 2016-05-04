
import java.util.*;
public class JoltikPHF extends BasicPokemon
{
    
    public JoltikPHF()
    {
        super(30, "Joltik PHF", new ArrayList<Attribute>(Arrays.asList(new NightMarchJoltikPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.L)), 1, Type.F, Type.M);

    }
    public JoltikPHF(ArrayList<Pokemon> attachedPokemon)
    {
        super(30, "Joltik PHF", new ArrayList<Attribute>(Arrays.asList(new NightMarchJoltikPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.L)), 1, Type.F, Type.M, attachedPokemon);
    }

    public JoltikPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools)
    {
        super(30, "Joltik PHF", new ArrayList<Attribute>(Arrays.asList(new NightMarchJoltikPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.L)), 1, Type.F, Type.M, attachedPokemon, attachedTools);
    }

    public JoltikPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools, ArrayList<Energy> attachedEnergy)
    {
        super(30, "Joltik PHF", new ArrayList<Attribute>(Arrays.asList(new NightMarchJoltikPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.L)), 1, Type.F, Type.M, attachedPokemon, attachedTools, attachedEnergy);
    }

    

}