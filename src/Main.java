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
        Aviary newAviary = new Aviary(5,5,5,"outside", "Home Aviary" ,"Blue Finch");
        newAviary.demoAviary();
//        newAviary.aviarySize();


    }
}