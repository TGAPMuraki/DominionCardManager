package DominionCards;

/**
 * Created by Muraki on 7/13/2017.
 */
public class DominionCard {
    private String name;
    private int cost;
    private String description;
    private DominionCardType type;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setType(DominionCardType type) {
        this.type = type;
    }

    public DominionCardType getType() {
        return type;
    }
}
