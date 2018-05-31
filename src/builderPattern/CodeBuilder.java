package builderPattern;

public class CodeBuilder {
    private Class rootClass = new Class();

    public CodeBuilder(String className)
    {
        rootClass.setName(className);
    }

    public CodeBuilder addField(String name, String type)
    {
        Field field = new Field(name, type);
        rootClass.getFields().add(field);
        return this;
    }

    @Override
    public String toString()
    {
        return rootClass.toString();
    }
}
