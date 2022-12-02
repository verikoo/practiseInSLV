import interfaseExamples.*;
import zoo.*;

public class Main {
    public static void main(String[] args) {
        ZooEmployee newEmployee = new ZooEmployee(1, "john", "doe", 24, 7, "africa", "england", "MBA");
        Zoo newZoo = new Zoo("Escape Zoo","New Delhi, Delhi, India", 12345, 4500, 34500, 4500);
        newEmployee.demoEmployee();
        newZoo.demoZoo();
        System.out.println("newEmployee hashcode is: " + newEmployee.hashCode());
        System.out.println("newZoo hashcode is: " + newZoo.hashCode());

        System.out.println("-------------") ;
        Monkey Mila = new Monkey("Mammal", 20, 4, "Chordata", "sooty", "brown", "Mila", 7, "love playing with people");
        Mila.demoMonkey();
        System.out.println("Mila hashcode is: " + Mila.hashCode());


        System.out.println("-------------") ;

        AviaryGarden yellowBirds = new AviaryGarden(105, 105, 80, "garden", "outside", "Baly Mina", 015, 21);
        yellowBirds.setHeight(109);
        yellowBirds.demoAviaryGarden();
        System.out.println("yellow birds aviary hashcode is: " + yellowBirds.hashCode());

        System.out.println('\n');
        System.out.println("-------------") ;

        AnimalAction[] animals = {new Elephant(), new Lion(), new Donkey()};
        animals[0] = new Elephant();
        animals[1] = new Lion();
        animals[2]= new Donkey();

        for (int i = 0; i < animals.length; i++) {
            animals[i].animalSound();
            animals[i].animalSleep();
            System.out.println("\n") ;
        }

        ZooEmployeeWork[] employerJob = {new ZooKeeper(), new LandscapeGardener(), new ZooTourGuide(), new VolunteerCoordinator()};
        employerJob[0]= new ZooKeeper();
        employerJob[1]= new LandscapeGardener();
        employerJob[2]= new ZooTourGuide();
        employerJob[3]= new VolunteerCoordinator();
        for(int i = 0; i < employerJob.length; i++){
            System.out.print("Job Title :"  + i);
            System.out.println("\r");
            employerJob[i].jobPosition();
            employerJob[i].jobPrimaryDuties();
            System.out.println("\n") ;


        }

    }


}