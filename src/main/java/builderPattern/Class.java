package builderPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    private String name;
    private String abstraction = Abstraction.Public.name();
    private List<Field> fields = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return toStringImpl();
    }

    private String toStringImpl() {
        StringBuilder sb = new StringBuilder();
        if (name != null && !name.isEmpty())
        {
            sb.append(String.format("%s class %s%s",abstraction, name, newLine));

            sb.append(String.format("{%s", newLine));


            for(Field field : fields){
                String i = String.join("", Collections.nCopies( indentSize, " "));
                sb.append(String.format("%s%s %s %s; %s", i,field.getAbstraction(), field.getType(), field.getName(), newLine));
            }
            sb.append("}");
        }

        return sb.toString();
    }
}
