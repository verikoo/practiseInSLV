import interfasexamples.*;
import zoo.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        ZooEmployee newEmployee = new ZooEmployee(1, "john", "doe", 24, 7, "africa", "england", "MBA");
        newEmployee.demoEmployee();
        System.out.println("newEmployee hashcode is: " + newEmployee.hashCode());
        System.out.println("-------Zoo Escape example------") ;
        EscapeZoo newEscapeZoo = new EscapeZoo("Escape Zoo","New Delhi, Delhi, India", 12345, 4500, 34500, 4500, "Mr Punjab Rao Deshmukh","Yeshoda Bai R");
        newEscapeZoo.demoEscapeZoo();
        System.out.println("\nZoo job positions");
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

        System.out.println("-------Animals examples------") ;
        System.out.println("Monkey");
        Monkey Mila = new Monkey("Mammal", 20, 4, "Chordata", "sooty", "brown", "Mila", 7, "love playing with people");
        Mila.demoMonkey();
        Mila.animalSound();
        Mila.animalSleep();
        System.out.println("Mila hashcode is: " + Mila.hashCode());
        System.out.println("\r");
        System.out.println("cat");
        Cat Lulu = new Cat("Felidae", 14, 2, "Chordate", "Siamese", "Point coloration", "Lulu", "Chocolate", true );
        Lulu.demoCat();
        Lulu.animalSound();
        Lulu.animalSleep();
        System.out.println("Lulu hashcode is: " + Lulu.hashCode());


        System.out.println("-------------") ;
        AviaryGarden yellowBirds = new AviaryGarden(105, 105, 80, "garden", "outside", "Baly Mina", 015, 21);
        yellowBirds.setHeight(109);
        yellowBirds.demoAviaryGarden();
        System.out.println("yellow birds aviary hashcode is: " + yellowBirds.hashCode());
        System.out.println('\n');
        System.out.println("-------------") ;

        System.out.println("feeding meat");

        FeedingMeat newMeat = new FeedingMeat("meat", "LLC ZOO FOOD", true, "specialized","red", "soft",140, 34);
        newMeat.demoMeat();
        newMeat.SumPrice(34,140);
        newMeat.calculateCalories();


        System.out.println("info");

        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");


    }


}