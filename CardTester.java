public class CardTester {

 public static void main(String[] args) {
  Card card1 = new Card("Jack", "Hearts", 10);
  Card card2 = new Card("3", "Spades", 3);
  Card card3 = new Card("Jack", "Hearts", 10);

  Card[] testArray = {
   card1,
   card2,
   card3
  };

  for (int i = 0; i < testArray.length; i++) {
   System.out.println("Suit of card #" + (i + 1) + ": " + testArray[i].suit());
   System.out.println("Rank of card #" + (i + 1) + ": " + testArray[i].rank());
   System.out.println("Point value of card #" + (i + 1) + ": " + testArray[i].pointValue());
   for (int j = 0; j < testArray.length; j++) {
    if (j != i)
     System.out.println("Card #" + (i + 1) + " matches card #" + (j + 1) + ": " + testArray[i].matches(testArray[j]));
   }
   System.out.println(testArray[i].toString());
   System.out.println();
  }
 }
}