package JavaCourseArmyOop.Army.Soldier;

import JavaCourseArmyOop.Army.Rank.Rank;
import JavaCourseArmyOop.Army.Weapon.Weapon;


public class Soldier {
    private final String name;
    private final Rank rank;
    private final Weapon weapon;
    private static int experience = 0;       // preparation for fight between 2 army

    public static int getExperience() {
        return experience;
    }

    public static void setExperience(int experience) {
        Soldier.experience = experience;
    }

    public Soldier(String name, Rank rank, Weapon weapon) {
        this.name = name;
        this.rank = rank;
        this.weapon = weapon;
    }

    public int getAttack() {
        return rank.getAttackRank() + weapon.getAttackWeapon();
    }

    public int getDefence() {
        return rank.getDefenceRank() + weapon.getDefenceWeapon();
    }

    public int getLives() {
        return rank.getLivesRank();
    }

    public void reportState() {
        System.out.println("My name is " + name + ".");
        rank.makeReport();
        weapon.weaponReport();


        System.out.println("I have: " + getLives() + " lives.");
        System.out.println("My overall attack is: " + getAttack() + "   and defence is: " + getDefence());
        System.out.println("Currently is my experience number: " + getExperience());

    }

}
