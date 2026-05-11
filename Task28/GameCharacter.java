package Task28;

// Context

class GameCharacter {
    private AttackStrategy strategy;

    public void setAttackStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        strategy.attack();
    }
}
