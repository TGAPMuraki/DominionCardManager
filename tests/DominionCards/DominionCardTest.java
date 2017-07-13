package DominionCards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static DominionCards.DominionCardType.ACTION;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Muraki on 7/13/2017.
 */
class DominionCardTest {

    private DominionCard card;

    @Test
    void cost_Test() {
        int testCost = 10;
        DominionCard card = new DominionCard();
        card.setCost(testCost);
        assertEquals(testCost, card.getCost());
    }

    @BeforeEach
    void setUp() {
        card = new DominionCard();
    }

    @Test
    void name_Test() {
        String testName = "Test Name";
        card.setName(testName);
        assertEquals(testName, card.getName());
    }

    @Test
    void description_Test() {
        String testDescription = "Test Description";
        card.setDescription(testDescription);
        assertEquals(testDescription, card.getDescription());
    }

    @Test
    void type_Test() {
        DominionCardType testType = ACTION;
        card.setType(testType);
        assertEquals(testType, card.getType());
    }
}