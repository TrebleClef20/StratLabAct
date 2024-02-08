public class Character {
    private type.Type type;

    public Character(type.Type type) {
        this.type = type;
    }

    public void attack(){
        System.out.println(type.attack());
    }

    public void defend(){
        System.out.println(type.defend());
    }
}