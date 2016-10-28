
public class Deck
{
	private Card[] cards;

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
				cards.append(new Card(s, v));
			}
		}
	}

	public Card removeCard()
	{
		sChoice = (int) (Math.random() * 4);
		vChoice = (int) (Math.random() * 13); //choose a random card


	}

}