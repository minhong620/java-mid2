package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            Suit[] values = Suit.values();
            for (Suit value : values) {
                cards.add(new Card(i, value));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    // 0번째 인덱스에 있는 카드를 반환한다
    public Card drawCard() {
        // removeFirst()를 이용할 수도 있다(java21)
        return cards.remove(0);
    }
}
