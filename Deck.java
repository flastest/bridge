import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> cards;

	public Deck()
	{
		this.buildDeck(); // add all cards to the deck
	}

	public void buildDeck()
	{
		for (int s = 0; s < 4; s++) // loop through suits (S,H,D,C)
		{
			for (int v = 0; v < 13; v++) // loop through all numbers (from 2 to Ace)
			{
				cards;
			}
		}
	}

	public Card removeCard()
	{
		int sChoice = (int) (Math.random() * 4);
		int vChoice = (int) (Math.random() * 13); //choose a random card

		for (Card card : cards) // loop through all the cards
		{ 
			if ()
		}

	}

}