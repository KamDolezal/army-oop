package JavaCourseArmyOop.Army.Weapon;

public class Sword extends Weapon {
    private static final int ATTACK_SWORD = 3;
    private static final int DEFENCE_SWORD = 3;

    public Sword() {
        super(ATTACK_SWORD, DEFENCE_SWORD);
    }

    @Override
    public void weaponReport() {
        System.out.println("My weapon is sword.");
    }
}
