public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", deck.dealCard());
            if (i % 4 == 0)
                System.out.println();
        }
    }
}
