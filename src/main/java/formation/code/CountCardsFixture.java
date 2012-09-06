package formation.code;

import fit.ActionFixture;

public class CountCardsFixture extends ActionFixture {

	public int numberOfCards = 0;
	
	public void addCards(int count) {
		numberOfCards += count;
	}
	
	public int numberOfCards() {
		return numberOfCards;
	}
	
}
