package type;

public class Knight implements Type {

    @Override
    public String attack() {
        return "Knight " + (new attack.SwingSword()).initiateAttack();
    }

    @Override
    public String defend() {
        String output = "";
        output += "Knight\n" + (new defend.ShieldDefense()).initiateDefense();
        output += "\n" + (new defend.DodgeDefense()).initiateDefense();
        output += "\n" + (new defend.CreateMagicBarrier()).initiateDefense();
        return output;
    }
}
