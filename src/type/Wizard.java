package type;

public class Wizard implements Type {
    @Override
    public String attack() {
        return "Wizard " + (new attack.CastSpell()).initiateAttack();
    }

    @Override
    public String defend() {
        return "Wizard\n" + (new defend.CreateMagicBarrier()).initiateDefense();
    }
}
