package SingletonPattern;

public class ChiefExecutingOfficer {

    private static String name;
    private static String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutingOfficer.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        ChiefExecutingOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutingOfficer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
