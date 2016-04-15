
import java.util.*;
public class JoltikPHF extends BasicPokemon
{
    
    
    public JoltikPHF()
    {
        ArrayList<Attributes> tempAttributes = new ArrayList<Attributes>();
        tempAttributes.add(new NightMarchAttack());
        
        ArrayList<Type> tempTypes = new ArrayList<Type>();
        tempTypes.add(Type.L);
        
        super(30, "Joltik PHF", tempAttributes, tempTypes, 1, Type.F, Type.M);
    }
    
    public JoltikPHF(ArrayList<Pokemon> attachedPokemon)
    {
        super(30, "Joltik PHF", tempAttributes, tempTypes, 1, Type.F, Type.M, attachedPokemon);
    }
    
    public JoltikPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools)
    {
        super(30, "Joltik PHF", tempAttributes, tempTypes, 1, Type.F, Type.M, attachedPokemon, attachedTools);
    }
    
    public JoltikPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools, ArrayList<Energy> attachedEnergy)
    {
        super(30, "Joltik PHF", tempAttributes, tempTypes, 1, Type.F, Type.M, attachedPokemon, attachedTools, attachedEnergy);
    }
    
}