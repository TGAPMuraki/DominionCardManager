package DominionCardsHTMLReader;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DominionCardsHTMLReaderTest {


    private DominionCardsHTMLReader cards;

    @BeforeEach
    void setUp() {
        cards = new DominionCardsHTMLReader();
    }

    @Test
    void loadFromURL_Test() {
        cards.loadFromWeb();
        assertEquals(183, cards.size());
    }

    @Test
    void saveToXML_Test() {
        System.out.println("saveToXML_Test");
        cards.loadFromWeb();
        cards.saveToXML("E:\\Temp\\DominionCards\\DominionCards.xml");
        assertEquals(0, 0);
    }
}
