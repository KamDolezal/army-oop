package JavaCourseArmyOop.Army.Weapon;

public class Slingshot extends Weapon {
    private static final int ATTACK_SLINGSHOT = 3;
    private static final int DEFENCE_SLINGSHOT = 0;

    public Slingshot() {
        super(ATTACK_SLINGSHOT, DEFENCE_SLINGSHOT);
    }

    @Override
    public void weaponReport() {
        System.out.println("My weapon is slingshot.");
    }
}
