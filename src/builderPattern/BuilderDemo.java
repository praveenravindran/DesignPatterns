package builderPattern;

import com.sun.tools.javac.jvm.Code;

public class BuilderDemo {

    public static void main(String[] args) {
        CodeBuilder codeBuilder = new CodeBuilder("Person").addField("name", "String")
                .addField("age", "int");
        System.out.println(codeBuilder);
    }
}
