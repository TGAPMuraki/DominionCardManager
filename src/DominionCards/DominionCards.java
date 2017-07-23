package DominionCards;

import DominionCard.DominionCard;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Muraki on 7/16/2017.
 */
public class DominionCards extends ArrayList<DominionCard> {
    public void sortByName() {
        super.sort(new Comparator<DominionCard>() {
            @Override
            public int compare(DominionCard card1, DominionCard card2) {
                return card1.getName().compareTo(card2.getName());
            }
        });
    }

    public void sortByCost() {
        super.sort(new Comparator<DominionCard>() {
            @Override
            public int compare(DominionCard card1, DominionCard card2) {
                return card1.getCost() - card2.getCost();
            }
        });
    }

}
