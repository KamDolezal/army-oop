package JavaCourseArmyOop.Army.Soldier;

import JavaCourseArmyOop.Army.Rank.Gladiator;
import JavaCourseArmyOop.Army.Rank.Rank;
import JavaCourseArmyOop.Army.Rank.Robber;
import JavaCourseArmyOop.Army.Rank.Villager;
import JavaCourseArmyOop.Army.Weapon.*;

import java.util.*;

public final class SoldierInicialization {
    int count;

    public SoldierInicialization(int count) {
        this.count = count;
    }

    public List<Soldier> getSoldiers() {
        List<Soldier> soldierList1 = new ArrayList<>();

        // initialization of ranks
        final Villager villager = new Villager();
        final Robber robber = new Robber();
        final Gladiator gladiator = new Gladiator();

        final Map<Integer, Rank> rankMap = new HashMap<>();
        rankMap.put(0, villager);
        rankMap.put(1, robber);
        rankMap.put(2, gladiator);


        // initialization of weapons
        final Fist fist = new Fist();
        final Pitchfork pitchfork = new Pitchfork();
        final Slingshot slingshot = new Slingshot();
        final Sword sword = new Sword();

        final Map<Integer, Weapon> weaponMap = new HashMap<>();
        weaponMap.put(0, fist);
        weaponMap.put(1, pitchfork);
        weaponMap.put(2, slingshot);
        weaponMap.put(3, sword);

        // names for soldiers
        final List<String> name = new ArrayList<>();
        name.add("Ryan");
        name.add("Andrew");
        name.add("Tom");
        name.add("George");
        name.add("CJ");
        name.add("Tony");
        name.add("Jose");
        name.add("Peter");
        name.add("Paul");
        name.add("Vincent");

        for (int x = 0; x < count; x++) {
            Random random1 = new Random();
            int number1 = random1.nextInt(3);   // random number which is used for establishing a rank

            Random random2 = new Random();
            int number2 = random2.nextInt(4);   // number is used for establishing a weapon

            Soldier soldier1 = new Soldier(name.get(x), rankMap.get(number1), weaponMap.get(number2));
            soldierList1.add(soldier1);

        }
        return soldierList1;
    }
}
