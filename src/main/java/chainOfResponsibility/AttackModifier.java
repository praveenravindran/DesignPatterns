package chainOfResponsibility;

public class AttackModifier extends CreatureModifier implements AutoCloseable {


    private int token;

    public AttackModifier(Creature creature) {
        super(creature);
    }

    public AttackModifier(Creature creature, Game game) {
        super(creature, game);
         token = game.queries.subscribe(q->{
            if(q.creatureName == creature.name &&
                    q.attribute == Query.Attribute.ATTACK){
                q.result *= 2;
            }
        });
    }

    @Override
    public void handle(){
        System.out.println("Doubling Attack");
        creature.attack *= 2;
        super.handle();
    }

    @Override
    public void close() throws Exception {
        game.queries.unsubscrile(token);
    }
}
