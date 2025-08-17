public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }
}