package DominionCards;

import DominionCard.DominionCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Muraki on 7/16/2017.
 */
class DominionCardsTest {

    private DominionCards cards;

    @BeforeEach
    void setUp() {
        cards = new DominionCards();
    }

    @Test
    void addCard_Test() {
        cards.add(new DominionCard());
        assertEquals(1, cards.size());
    }

    @Test
    void sortByName_Test() {
        cards.add(new DominionCard("ABD_Test"));
        cards.add(new DominionCard("ABC_Test"));

        cards.sortByName();
        assertEquals("ABC_Test", cards.get(0).getName());
    }

    @Test
    void sortByCost_Test() {
        cards.add(new DominionCard("", 5));
        cards.add(new DominionCard("", 3));

        cards.sortByCost();
        assertEquals(3, cards.get(0).getCost());
    }

}