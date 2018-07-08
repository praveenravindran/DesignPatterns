package chainOfResponsibility;

public class DefenseModifier extends CreatureModifier implements AutoCloseable{

    private int token;

    public DefenseModifier(Creature creature) {
        super(creature);
    }

    public DefenseModifier(Creature creature, Game game) {
        super(creature, game);
        token = game.queries.subscribe(q->{
           if(q.creatureName == creature.name && q.attribute == Query.Attribute.DEFENSE){
               q.result += 3;
           }
        });

    }

    @Override
    public void handle() {
        System.out.println("Attacking Creature defense by 2");
        creature.defense += 2;
        super.handle();
    }

    @Override
    public void close() throws Exception {
        game.queries.unsubscrile(token);
    }
}
