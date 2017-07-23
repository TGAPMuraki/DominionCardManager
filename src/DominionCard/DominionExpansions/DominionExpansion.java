package DominionCard.DominionExpansions;

/**
 * Created by Muraki on 7/16/2017.
 */
public enum DominionExpansion {
    DOMINION("DOMINION"),
    INTRIGUE("INTRIGUE"),
    SEASIDE("SEASIDE"),
    ALCHEMY("ALCHEMY"),
    PROSPERITY("PROSPERITY"),
    CORNUCOPIA("CORNUCOPIA"),
    HINTERLANDS("HINTERLANDS"),
    DARK_AGES("DARK-AGES"),
    GUILDS("GUILDS");

    private String name;

    DominionExpansion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
