public class DeckTester
{
    public static void main(String[] args)
    {
        Deck deck = new Deck(new String[]{"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}, new String[]{"Spade", "Heart", "Clubs", "Diamond"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        deck.shuffle();
        System.out.println(deck.deal());
    }
}
