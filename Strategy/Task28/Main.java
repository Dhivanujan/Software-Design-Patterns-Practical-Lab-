package Strategy.Task28;

// Client

public class Main {
    public static void main(String[] args) {

        GameCharacter player = new GameCharacter();

        player.setAttackStrategy(new SwordAttack());
        player.performAttack();

        player.setAttackStrategy(new GunAttack());
        player.performAttack();

        player.setAttackStrategy(new MagicAttack());
        player.performAttack();
    }
}