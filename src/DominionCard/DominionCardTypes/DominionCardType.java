package DominionCard.DominionCardTypes;

/**
 * Created by Muraki on 7/13/2017.
 */
public enum DominionCardType {
    ACTION("ACTION"),
    REACTION("REACTION"),
    ATTACK("ATTACK"),
    VICTORY("VICTORY"),
    TREASURE("TREASURE"),
    DURATION("DURATION"),
    PRIZE("PRIZE"),
    LOOTER("LOOTER"),
    RUINS("RUINS"),
    KNIGHT("KNIGHT"),
    SHELTER("SHELTER");

    private String name;

    DominionCardType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
