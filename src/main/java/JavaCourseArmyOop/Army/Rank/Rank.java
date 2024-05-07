package JavaCourseArmyOop.Army.Rank;

public abstract class Rank {
    int attackRank;
    int defenceRank;
    int livesRank;

    public Rank(int attackRank, int defenceRank, int livesRank) {
        this.attackRank = attackRank;
        this.defenceRank = defenceRank;
        this.livesRank = livesRank;
    }

    public void makeReport() {

    }

    public int getAttackRank() {
        return attackRank;
    }

    public int getDefenceRank() {
        return defenceRank;
    }

    public int getLivesRank() {
        return livesRank;
    }
}
