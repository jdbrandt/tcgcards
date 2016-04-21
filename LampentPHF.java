import java.util.*;
public class LampentPHF extends Stage1Pokemon
{
    public LampentPHF()
    {
        super(70, "Lampent PHF", new ArrayList<Attribute>(Arrays.asList(new CursedDropLampentPHFAttack(), new NightMarchLampentPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 2, Type.D, Type.F);
    }
    
    public LampentPHF(ArrayList<Pokemon> attachedPokemon)
    {
        super(70, "Lampent PHF", new ArrayList<Attribute>(Arrays.asList(new CursedDropLampentPHFAttack(), new NightMarchLampentPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 1, Type.D, Type.F, attachedPokemon);
    }

    public LampentPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools)
    {
        super(70, "Lampent PHF", new ArrayList<Attribute>(Arrays.asList(new CursedDropLampentPHFAttack(), new NightMarchLampentPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 1, Type.D, Type.F, attachedPokemon, attachedTools);
    }

    public LampentPHF(ArrayList<Pokemon> attachedPokemon, ArrayList<Tool> attachedTools, ArrayList<Energy> attachedEnergy)
    {
        super(70, "Lampent PHF", new ArrayList<Attribute>(Arrays.asList(new CursedDropLampentPHFAttack(), new NightMarchLampentPHFAttack())), new ArrayList<Type>(Arrays.asList(Type.P)), 1, Type.D, Type.F, attachedPokemon, attachedTools, attachedEnergy);
    }
}
