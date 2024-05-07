package JavaCourseArmyOop.Army;

import JavaCourseArmyOop.Army.Soldier.Soldier;
import JavaCourseArmyOop.Army.Soldier.SoldierInicialization;

import java.util.List;

public class Army {
    String name;

    public Army(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    SoldierInicialization soldierInicialization = new SoldierInicialization(10);
    List<Soldier> army = soldierInicialization.getSoldiers();

    public void makeArmyReport() {
        System.out.println("-----");
        System.out.println("Name of army is: " + getName());
        System.out.println("-----");
        for (Soldier soldier : army) {
            soldier.reportState();
            System.out.println("---");
        }
    }

    public int[] attack() {
        // method attack boost attack skill of each soldier, but decrease ability of defence
        int ATTACK_BOOST = 2;
        int DEFENCE_PENALTY = 2;

        int overallAttack = 0;
        int overallDefence = 0;

        for (Soldier soldier : army) {
            overallAttack += soldier.getAttack() + ATTACK_BOOST;
            overallDefence += soldier.getDefence() - DEFENCE_PENALTY;
        }
        int[] result = {overallAttack, overallDefence};
        System.out.println("Overall attack is: " + overallAttack + "  overall defence is: " + overallDefence);
        return result;
    }

    public int[] defence() {
        // method attack boost attack skill of each soldier, but decrease ability of defence
        int ATTACK_PENALTY = 4;
        int DEFENCE_BOOST = 3;

        int overallAttack = 0;
        int overallDefence = 0;

        for (Soldier soldier : army) {
            overallAttack += soldier.getAttack() - ATTACK_PENALTY;
            overallDefence += soldier.getDefence() + DEFENCE_BOOST;
        }
        int[] result = {overallAttack, overallDefence};
        System.out.println("Overall attack is: " + overallAttack + "  overall defence is: " + overallDefence);
        return result;
    }

}
