public class Card
{
	private final int rank;
	private final int suit;
	
	public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	public Card(int rank, int suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString()
	{
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}
	
	public boolean equals(Card that)
	{
		return this.rank == that.rank && this.suit == that.suit;
	}
	
	public int compareTo(Card that)
	{
		if (this.suit < that.suit)
		{
			return -1;
		}
		if (this.suit > that.suit)
		{
			return 1;
		}
		if (this.rank < that.rank)
		{
			if (this.rank == 1 && that.rank != 1)
			{
				return 1;
			}
			return -1;
		}
		if (this.rank > that.rank)
		{
			if (that.rank == 1 && this.rank != 1)
			{
				return -1;
			}
			return 1;
		}
		return 0;
	}
	
	public int getRank()
	{
		return this.rank;
	}
	
	public int getsuit()
	{
		return this.suit;
	}
	
	public static void printDeck(Card[] cards)
	{
		for (int i = 0; i < cards.length; i++)
		{
			System.out.println(cards[i]);
		}
	}
	
	public static void printHand(Card[] cards)
	{
		System.out.print("[ ");
		for (int i = 0; i < cards.length - 1; i++)
		{
			System.out.print(cards[i] + ", ");
		}
		System.out.println(cards[cards.length-1] + " ]");
	}
	
	public static Card[] makeDeck()
	{
		Card[] cards = new Card[52];
		
		int index = 0;
		for (int suit = 0; suit < SUITS.length; suit++)
		{
			for (int rank = 1; rank < RANKS.length; rank++)
			{
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		
		return cards;
	}
	
	public static Card[] generateHand()
	{
		Card[] cards = new Card[5];
		
		for (int i = 0; i < 5; i++)
		{
			int rank = (int) (Math.random() * 13 + 1);
			int suit = (int) (Math.random() * 4);
			cards[i] = new Card(rank, suit);
		}
		
		return cards;
	}
	
	public static boolean hasFlush(Card[] hand)
	{
		if (hand.length < 5)
		{
			return false;
		}
		for (int i = 0; i < hand.length-1; i++)
		{
			if (hand[i].suit != hand[i+1].suit)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Card[] cards = makeDeck();
		printDeck(cards);
		
		Card aceOfSpades = new Card(1,3);
		Card aceOfSpades2 = new Card(1,3);
		Card kingOfSpades = new Card(13,3);
		System.out.println(aceOfSpades.compareTo(kingOfSpades));
		System.out.println(aceOfSpades.equals(kingOfSpades));
		System.out.println(aceOfSpades.compareTo(aceOfSpades2));
		System.out.println(aceOfSpades.equals(aceOfSpades2));
		
		System.out.println(hasFlush(new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]}));
		System.out.println(hasFlush(new Card[] {cards[0]}));
		System.out.println(hasFlush(new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4], cards[25]}));
		System.out.println(hasFlush(new Card[] {cards[0], cards[1], cards[2], cards[3]}));
		System.out.println(hasFlush(new Card[] {cards[47], cards[48], cards[49], cards[50], cards[51]}));
		
		Card[] pokerHand = generateHand();
		printHand(pokerHand);
		pokerHand = generateHand();
		printHand(pokerHand);
	}
}