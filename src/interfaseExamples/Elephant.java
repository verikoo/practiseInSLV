package interfaseExamples;

public class Elephant implements AnimalAction {
    @Override
    public void animalSound() {
        System.out.println("Elephants make a sound, known as a trumpet");

    }

    public void animalSleep(){
        System.out.println("Elephant  in zoos sleep for four to six hours a day");
    }
}
