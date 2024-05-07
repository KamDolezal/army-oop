package JavaCourseArmyOop.Army.Rank;

public class Robber extends Rank {
    private static final int ATTACK_ROBBER = 3;
    private static final int DEFENCE_ROBBER = 1;
    private static final int LIVES_ROBBER = 4;

    public Robber() {
        super(ATTACK_ROBBER, DEFENCE_ROBBER, LIVES_ROBBER);
    }

    @Override
    public void makeReport() {
        System.out.println("I am robber.");
    }
}
