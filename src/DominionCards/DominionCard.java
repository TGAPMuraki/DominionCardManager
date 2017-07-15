package DominionCards;

/**
 * Created by Muraki on 7/13/2017.
 */
public class DominionCard {
    private String name;
    private int cost;
    private String description;
    private DominionCardTypes types;
    private DominionExpansion expansion;

    public DominionCard() {
        this.types = new DominionCardTypes();
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DominionCardTypes getTypes() {
        return types;
    }

    public void setTypes(DominionCardTypes types) {
        this.types = types;
    }

    public void setTypes(DominionCardType[] types) {
        for (int i = 0; i < types.length; i++)
            this.types.add(types[i]);
    }

    public DominionExpansion getExpansion() {
        return expansion;
    }

    public void setExpansion(DominionExpansion expansion) {
        this.expansion = expansion;
    }
}
