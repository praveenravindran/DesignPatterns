package chainOfResponsibility;

public class Creature {
    public String name;

    private Game game;

    public int attack, defense;

    public Creature(String name, Game game, int attack, int defense) {
        this.name = name;
        this.game = game;
        this.attack = attack;
        this.defense = defense;
    }

    public Creature(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        Query q = new Query(name, Query.Attribute.ATTACK, attack);
        game.queries.fire(q);
        return q.result;
    }

    public int getDefense() {
        Query q = new Query(name, Query.Attribute.DEFENSE, defense);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public String toStirngCQS(){
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                '}';
    }
}
