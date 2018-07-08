package chainOfResponsibility;

public class CreatureModifier {
    protected Creature creature;
    protected CreatureModifier next;
    protected Game game;

    public CreatureModifier(Creature creature, Game game) {
        this.creature = creature;
        this.game = game;
    }

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModifier cm){
        if(next != null){
            next.add(cm);
        } else {
            next = cm;
        }
    }

    public void handle(){
        if(next != null){
            next.handle();
        }
    }
}
