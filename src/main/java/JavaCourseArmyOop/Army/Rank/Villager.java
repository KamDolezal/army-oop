package JavaCourseArmyOop.Army.Rank;

public class Villager extends Rank {
    private static final int ATTACK_VILLAGER = 1;
    private static final int DEFENCE_VILLAGER = 1;
    private static final int LIVES_VILLAGER = 3;

    public Villager() {
        super(ATTACK_VILLAGER, DEFENCE_VILLAGER, LIVES_VILLAGER);
    }

    @Override
    public void makeReport() {
        System.out.println("I am villager.");
    }
}
