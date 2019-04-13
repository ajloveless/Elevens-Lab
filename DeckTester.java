/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck1 = new Deck(new String[]{"Jack","3","Queen"},new String[]{"Clubs","Hearts","Spades"},new int[]{10,3,10});
		Deck deck2 = new Deck(new String[]{},new String[]{},new int[]{});
		Deck deck3 = new Deck(new String[]{"4","2"},new String[]{"Spades","Diamonds"},new int[]{4,2});


		Deck[] testArray = {deck1,deck2,deck3};

		for(int i=0;i<testArray.length;i++)
		{
			System.out.println("Is the deck empty? " + testArray[i].isEmpty());
			System.out.println("The deck has " + testArray[i].size() + " cards.");
			System.out.println("The top card off the deck is the " + testArray[i].deal());
			System.out.println(testArray[i].toString() + "\n");

		}

	}
}
