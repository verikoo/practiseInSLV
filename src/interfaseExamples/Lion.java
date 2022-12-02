package interfaseExamples;

public class Lion implements AnimalAction{
    @Override
    public void animalSound(){
        System.out.println("Lion make sound: roar");
    }

    public void animalSleep(){
        System.out.println("Lion sleeps 21 hour");
    }
}
