package JavaCourseArmyOop.Army.Rank;

public class Gladiator extends Rank {
    private static final int ATTACK_GLADIATOR = 4;
    private static final int DEFENCE_GLADIATOR = 3;
    private static final int LIVES_GLADIATOR = 5;

    public Gladiator() {
        super(ATTACK_GLADIATOR, DEFENCE_GLADIATOR, LIVES_GLADIATOR);
    }

    @Override
    public void makeReport() {
        System.out.println("I am gladiator.");
    }
}
