package chainOfResponsibility;

public class Query {
    public String creatureName;
    public enum Attribute{
        ATTACK, DEFENSE;
    }
    public Attribute attribute;
    int result;

    public Query(String creatureName, Attribute attribute, int result) {
        this.creatureName = creatureName;
        this.attribute = attribute;
        this.result = result;
    }
}
