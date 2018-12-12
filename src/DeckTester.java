public class DeckTester
{
    public static void main(String[] args)
    {
        Deck deck = new Deck(A,Spade,1);
        deck.shuffle();
        System.out.println(deck.deal());
    }
}
