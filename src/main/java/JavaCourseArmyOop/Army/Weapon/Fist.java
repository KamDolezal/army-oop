package JavaCourseArmyOop.Army.Weapon;

public class Fist extends Weapon {
    private static final int ATTACK_FIST = 1;
    private static final int DEFENCE_FIST = 1;

    public Fist() {
        super(ATTACK_FIST, DEFENCE_FIST);
    }

    @Override
    public void weaponReport() {
        System.out.println("My weapon is fist.");
    }
}
