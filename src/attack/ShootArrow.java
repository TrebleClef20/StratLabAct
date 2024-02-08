package attack;

public class ShootArrow implements AttackStrategy {
    @Override
    public String initiateAttack() {
        return "shoots an arrow!";
    }
}