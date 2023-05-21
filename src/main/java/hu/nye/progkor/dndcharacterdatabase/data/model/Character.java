package hu.nye.progkor.dndcharacterdatabase.data.model;


/**
 * Model class for DnD characters.
 */
public class Character {

    private Long ID;

    private String owner;

    private String name;

    private int level;

    private Klass klass;

    private Race race;

    private String background;

    private int experience;

    private int strength;

    private int dexterity;

    private int constitution;

    private int intelligence;

    private int wisdom;

    private int charisma;

    private int wealth;

    public Character(Long ID, String owner, String name, int level, Klass klass, Race race, String background, int experience, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int wealth, String[] inventory, String[] proficiencies, String[] languages, String[] features) {
        this.ID = ID;
        this.owner = owner;
        this.name = name;
        this.level = level;
        this.klass = klass;
        this.race = race;
        this.background = background;
        this.experience = experience;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.wealth = wealth;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        if (getLevel() != character.getLevel()) return false;
        if (getExperience() != character.getExperience()) return false;
        if (getStrength() != character.getStrength()) return false;
        if (getDexterity() != character.getDexterity()) return false;
        if (getConstitution() != character.getConstitution()) return false;
        if (getIntelligence() != character.getIntelligence()) return false;
        if (getWisdom() != character.getWisdom()) return false;
        if (getCharisma() != character.getCharisma()) return false;
        if (getWealth() != character.getWealth()) return false;
        if (getID() != null ? !getID().equals(character.getID()) : character.getID() != null) return false;
        if (getOwner() != null ? !getOwner().equals(character.getOwner()) : character.getOwner() != null) return false;
        if (getName() != null ? !getName().equals(character.getName()) : character.getName() != null) return false;
        if (getKlass() != character.getKlass()) return false;
        if (getRace() != character.getRace()) return false;
        return getBackground() != null ? getBackground().equals(character.getBackground()) : character.getBackground() == null;
    }

    @Override
    public int hashCode() {
        int result = getID() != null ? getID().hashCode() : 0;
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getLevel();
        result = 31 * result + (getKlass() != null ? getKlass().hashCode() : 0);
        result = 31 * result + (getRace() != null ? getRace().hashCode() : 0);
        result = 31 * result + (getBackground() != null ? getBackground().hashCode() : 0);
        result = 31 * result + getExperience();
        result = 31 * result + getStrength();
        result = 31 * result + getDexterity();
        result = 31 * result + getConstitution();
        result = 31 * result + getIntelligence();
        result = 31 * result + getWisdom();
        result = 31 * result + getCharisma();
        result = 31 * result + getWealth();
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", klass=" + klass +
                ", race=" + race +
                ", background='" + background + '\'' +
                ", experience=" + experience +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                ", wealth=" + wealth +
                '}';
    }
}