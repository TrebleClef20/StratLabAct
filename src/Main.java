public class Main {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        System.out.println("Knight actions:");
        knight.attack();
        knight.defend();
        System.out.println();

        System.out.println("Wizard actions:");
        wizard.attack();
        wizard.defend();
        System.out.println();

        System.out.println("Archer actions:");
        archer.attack();
        archer.defend();
    }
}
