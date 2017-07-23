package DominionCardsHTMLReader;

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
}
