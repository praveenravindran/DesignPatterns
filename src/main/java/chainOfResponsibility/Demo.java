package chainOfResponsibility;

public class Demo {

    public static void main(String[] args) {
        //1. Method Chain
        Creature creature = new Creature("Goblin", 2, 3);

        CreatureModifier root = new CreatureModifier(creature);
        AttackModifier attackModifier = new AttackModifier(creature);
        DefenseModifier defenceModifier = new DefenseModifier(creature);
        NoModifier noModifier = new NoModifier(creature);
        //  Adding a no modifier cancels out the bonuses
        //  root.add(noModifier);
        root.add(attackModifier);
        root.add(defenceModifier);
        root.handle();
        System.out.println(creature);

        //2. Broker Chain with CQS
        Game game = new Game();
        Creature goblin = new Creature("Strong Goblin", game, 2, 2);

        goblin.toStirngCQS();

        // modifiers can be piled up
        DefenseModifier icm = new DefenseModifier(goblin, game);

        AttackModifier dam = new AttackModifier(goblin, game);

        goblin.toStirngCQS();
    }
}
