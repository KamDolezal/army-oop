package JavaCourseArmyOop;

import JavaCourseArmyOop.Army.Army;

public class Main {
    public static void main(String[] args) {

        Army army1 = new Army("Hells angels");
        army1.makeArmyReport();
        System.out.println("Army " + army1.getName() + " stats in case of usage methods:");
        System.out.println("Method attack:");
        army1.attack();
        System.out.println("Method defence:");
        army1.defence();

    }
}
