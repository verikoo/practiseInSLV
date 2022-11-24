package zoo;

public abstract class Animals {
    private  String familyClassification; //class
    private int lifeCircle; //sicocxlisganggrdzlivoba
    private int age;
    private String phylum; //gvari
    private String species; //saxeoba
    private String color;
    private String name ;

    public Animals(){
        this.familyClassification=null;
        this.lifeCircle=0;
        this.age=0;
        this.phylum=null;
        this.species=null;
        this.color=null;
        this.name=null;
    }

    public Animals(String familyClassification, int lifeCircle, int age, String phylum, String species, String color,String name){
        this.familyClassification= familyClassification;
        this.lifeCircle=lifeCircle;
        this.age=age;
        this.phylum=phylum;
        this.species=species;
        this.color=color;
        this.name=name;
    }

    //get--------------------------------------

    public String getFamilyClassification() {
        return familyClassification;
    }

    public int getLifeCircle() {
        return lifeCircle;
    }

    public int getAge() {
        return age;
    }

    public String getPhylum() {
        return phylum;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    //set------------------------------------
    public void setFamilyClassification(String familyClassification) {
        this.familyClassification = familyClassification;
    }
    public void setLifeCircle(int lifeCircle) {
        this.lifeCircle = lifeCircle;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void demoAnimalsExample(){
        System.out.println("Name :" + this.getName());
        System.out.println("Maximum life span:"+ this.getLifeCircle());
        System.out.println("Age:"+ this.getAge());
        System.out.println("Color:"+ this.getColor());
        System.out.println("Phylum: "+ this.getPhylum());
        System.out.println("Class: "+ this.getFamilyClassification());
    }
}
