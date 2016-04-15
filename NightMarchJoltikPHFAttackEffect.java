

public class NightMarchJoltikPHFAttackEffect extends AttackEffect
{
    public NightMarchJoltikPHFAttackEffect()
    {
        super();
    }
    
    public void activate(Object o)
    {
       Game g = (Game) o;
       Player[] players = g.getPlayers();
       Player opponent;
       Player current;
       if (players[0].equals(g.getCurrentPlayer()))
       {
           current = players[0];
           opponent = players[1];
        }
        else
{
    current = players[1];
    }
    
    public int getDamage()
    {
        
        