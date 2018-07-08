package chainOfResponsibility;

public class NoModifier extends CreatureModifier{

    public NoModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("You dont get any bonuses!");
    }
}
