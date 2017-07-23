package DominionCard;

import DominionCard.DominionCardTypes.DominionCardType;
import DominionCard.DominionCardTypes.DominionCardTypes;
import DominionCard.DominionExpansions.DominionExpansion;
import com.sun.javafx.scene.layout.region.Margins;

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
    public DominionCard(String name){
        this.name = name;
    }
    public DominionCard(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCost(String cost){
        cost = cost.replace("$", "");
        cost = cost.replace("*", "");
        setCost(Integer.parseInt(cost));
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

    public void setTypes(String types){
        types = types.toUpperCase();
        DominionCardTypes newTypes = new DominionCardTypes();
        for(DominionCardType type : DominionCardType.values()){
            if(types.contains(type.toString()))
                newTypes.add(type);
        }
        setTypes(newTypes);
    }

    public DominionExpansion getExpansion() {
        return expansion;
    }

    public void setExpansion(DominionExpansion expansion) {
        this.expansion = expansion;
    }
}
