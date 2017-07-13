package DominionCards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Muraki on 7/13/2017.
 */
class DominionCardTest {
    @Test
    void cost_Test() {
        int testCost = 10;
        DominionCard card = new DominionCard();
        card.setCost(testCost);
        assertEquals(testCost, card.getCost());
    }

    @Test
    void name_Test() {
        String testName = "TestName";
        DominionCard card = new DominionCard();
        card.setName(testName);
        assertEquals(testName, card.getName());
    }

}