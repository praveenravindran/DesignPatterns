package recursiveGenericsBuilderPattern;


class RecursiveGenericsDemo
{
    public static void main(String[] args)
    {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Praveen")
                .worksAs("Software Engineer");

        System.out.println(eb.build());
    }
}