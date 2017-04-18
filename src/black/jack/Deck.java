package black.jack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by HP on 4/18/2017.
 */
public class Deck {
  int numberOfCardInDeck;
  Card cards;
  ArrayList<Card> cardsList;
  RandomGenrator randomGenrator;


  public Deck(int numberOfCardInDeck) {
    this.numberOfCardInDeck = numberOfCardInDeck;
    cardsList = new ArrayList<>();
    int randHeart = 0;
    int randClubs = 0;
    int randSpades = 0;
    int randDiamonds = 0;
    //   while ((randHeart + randClubs + randSpades + randDiamonds) < numberOfCardInDeck) {
    for (int i = 0; i < numberOfCardInDeck / 4; i++) {
      randHeart = (int) (Math.random() * (numberOfCardInDeck / 4 + 1));
      this.cards = new Card(randHeart, "Heart");

      cardsList.add(cards);

    }
    for (int i = 0; i < numberOfCardInDeck / 4; i++) {
      randClubs = (int) (Math.random() * (numberOfCardInDeck / 4 + 1));
      this.cards = new Card(randClubs, "Clubs");

      cardsList.add(cards);

    }
    for (int i = 0; i < numberOfCardInDeck / 4; i++) {
      randSpades = (int) (Math.random() * (numberOfCardInDeck / 4 + 1));
      this.cards = new Card(randSpades, "Spades");

      cardsList.add(cards);

    }
    for (int i = 0; i < numberOfCardInDeck / 4; i++) {
      randDiamonds = (int) (Math.random() * (numberOfCardInDeck / 4 + 1));
      this.cards = new Card(randDiamonds, "Diamonds");

      cardsList.add(cards);

    }
    //   }
    // List<Integer> load = randomGenrator.n_random(4, 4);
    //   for (int i = 0; i < randomGenrator.n_random(numberOfCardInDeck, 4).size(); i++) {
    //   System.out.println(load.get(1));
    //   }
  }

  public String getInfoDeck() {
    String result = numberOfCardInDeck + " Cards - ";
    for (int i = 0; i < cardsList.size(); i++) {
      result += cardsList.get(i).getInfo();
    }
    return result;
  }

  public Card draw() {
    Card drawnCard = new Card();
    drawnCard = cardsList.get(0);
    cardsList.remove(0);
    return drawnCard;
  }

  public List<Card> shuffel() {
    ArrayList<Card> suffeledList = new ArrayList<>();
    suffeledList = Collections.shuffle(cardsList);
    return suffeledList;
  }
}
