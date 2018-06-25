package proxy;

public class Creature {

    private Property<Integer> ability = new Property<>(10);

    public int getAbility() {
        return ability.getValue();
    }

    public void setAbility(int ability) {
        this.ability.setValue(ability);
    }
}
