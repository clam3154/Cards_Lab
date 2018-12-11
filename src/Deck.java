import java.util.ArrayList;

public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String rank, String suit, int pointValue)
    {

    }

    public boolean isEmpty()
    {
        if (unDealt.size() == 0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(unDealt.isEmpty())
        {
            return null;
        }
        Card sub = unDealt.get(0);
        Dealt.add(sub);
        unDealt.remove(0);
        return sub;
    }

    public shuffle()
    {
        for(int i =0; i<Dealt.size(); i++)
        {
            Card sub = Dealt.get(0);
            unDealt.add(sub);
            Dealt.remove(0);
        }
        for(int k = 51; k > 1; k--)
        {
            
        }
    }
}
