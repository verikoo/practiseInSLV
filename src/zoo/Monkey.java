package zoo;

public class Monkey extends Animals{
    private int weight;
    private String characterType; // love or not visitors

    public Monkey(String familyClassification, int lifeCircle, int age, String phylum, String species, String color, String name, int weight, String characterType) {
        super(familyClassification, lifeCircle, age, phylum, species, color, name);
        this.weight = weight;
        this.characterType = characterType;
    }

    public int getWeight() {
        return weight;
    }

    public String getCharacterType() {
        return characterType;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public void demoMonkey(){
        demoAnimalsExample();
        System.out.println("Weight :" + this.getWeight());
        System.out.println("CharacterType:"+ this.getCharacterType());
    }

}
