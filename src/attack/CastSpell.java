package attack;

public class CastSpell implements AttackStrategy {
    @Override
    public String initiateAttack() {
        return "casts a spell!";
    }
}