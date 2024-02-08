package type;

public class Archer implements Type {

    @Override
    public String attack() {
        return "Archer " + (new attack.ShootArrow()).initiateAttack();
    }

    @Override
    public String defend() {
        return "Archer\n" + (new defend.ShieldDefense()).initiateDefense();
    }
}
