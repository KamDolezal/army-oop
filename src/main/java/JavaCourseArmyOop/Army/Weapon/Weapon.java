package JavaCourseArmyOop.Army.Weapon;

public abstract class Weapon {
    int attackWeapon;
    int defenceWeapon;

    public Weapon(int attackWeapon, int defenceWeapon) {
        this.attackWeapon = attackWeapon;
        this.defenceWeapon = defenceWeapon;
    }

    public int getAttackWeapon() {
        return attackWeapon;
    }

    public int getDefenceWeapon() {
        return defenceWeapon;
    }

    public void weaponReport() {

    }
}
