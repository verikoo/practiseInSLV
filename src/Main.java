import zoo.Animals;
import zoo.ZooEmployee;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animals newAnimal = new Animals("family", 40, 11, "phulum","species","color", "name" );
        ZooEmployee newEmployee = new ZooEmployee(1, "john", "doe", 24, 7, "africa", "england", "MBA");
        Zoo newZoo = new Zoo("Escape Zoo","New Delhi, Delhi, India", 12345, 4500, 34500, 4500);
        newAnimal.demoAnimalsExample();
        newEmployee.demoEmployee();
        newZoo.demoZoo();

    }
}