package black.jack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/18/2017.
 */
public class Deck {
  int numberOfCardInDeck;
  Card cards;
  List<Card> cardsList;

  public Deck(int numberOfCardInDeck) {
    this.numberOfCardInDeck = numberOfCardInDeck;
    cardsList = new ArrayList<>();
    for (int i = 0; i < numberOfCardInDeck; i++) {
      this.cards = new Card((int) (Math.random() * 11), "Heart");
      cardsList.add(cards);
    }
  }

  public String getInfoDeck() {
    return numberOfCardInDeck + "Cards - " + cards.getInfo();
  }

  public Card draw() {
    Card drawnCard = new Card();
    drawnCard = cardsList.get(0);
    cardsList.remove(0);
    return drawnCard;
  }

}
