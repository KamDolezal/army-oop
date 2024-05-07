package JavaCourseArmyOop.Army.Weapon;

public class Pitchfork extends Weapon {
    private static final int ATTACK_PITCHFORK = 2;
    private static final int DEFENCE_PITCHFORK = 1;

    public Pitchfork() {
        super(ATTACK_PITCHFORK, DEFENCE_PITCHFORK);
    }

    @Override
    public void weaponReport() {
        System.out.println("My weapon is pitchfork.");
    }
}
