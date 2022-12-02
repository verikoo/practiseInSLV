package interfaseExamples;

public class LandscapeGardener implements ZooEmployeeWork{
    @Override
    public void jobPosition(){
        System.out.println("Landscape Gardener");
    }
    public void jobPrimaryDuties(){
        System.out.println("A landscape gardener takes care of the plants, flowers, and trees within the zoo landscape.");
    }
}
