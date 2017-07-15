package DominionCards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static DominionCards.DominionCardType.ACTION;
import static DominionCards.DominionCardType.REACTION;
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
    void setTypes_withArray_Test() {
        DominionCardTypes cardTypes = new DominionCardTypes();
        cardTypes.add(DominionCardType.ACTION);
        cardTypes.add(DominionCardType.REACTION);
        card.setTypes(new DominionCardType[]{DominionCardType.ACTION, DominionCardType.REACTION});
        assertEquals(cardTypes, card.getTypes());
    }

    @Test
    void setTypes_withTypes_Test() {
        DominionCardTypes cardTypes = new DominionCardTypes();
        cardTypes.add(DominionCardType.ACTION);
        card.setTypes(cardTypes);
        assertEquals(cardTypes, card.getTypes());
    }

    @Test
    void types_contains_type_test() {
        card.setTypes(new DominionCardType[]{DominionCardType.ACTION, DominionCardType.REACTION});
        assertTrue(card.getTypes().contains(DominionCardType.ACTION));
    }

    @Test
    void expansion_Test() {
        card.setExpansion(DominionExpansion.DOMINION);
        assertEquals(DominionExpansion.DOMINION, card.getExpansion());
    }
}