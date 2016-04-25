

public class JudgeEffect extends SupporterEffect
{
    public JudgeEffect()
    {
        super();
    }
    
    public void activate(Game g)
    {
        Player[] players = g.getPlayers();
        for (Player p : players)
        {
            p.shuffleHandIntoDeck();
            p.drawNCards(4);
        }
    }
}
    