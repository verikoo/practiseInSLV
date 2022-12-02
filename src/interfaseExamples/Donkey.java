package interfaseExamples;

public class Donkey implements AnimalAction{
    @Override
    public void animalSound(){
        System.out.println("Donkey make a sound: bray");
    }
    public void animalSleep(){
        System.out.println("Donkey sleeps 3 hours");
    }
}
