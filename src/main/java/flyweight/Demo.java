package flyweight;

public class Demo {

    public static void main(String[] args) {
        //Without Flyweight
        User user1 = new User("John Smith");
        User user2 = new User("Jane Smith");

        System.out.println(user1.getFullName());
        System.out.println(user2.getFullName());

        //With Flyweight
        User2 user3 = new User2("Mary Jane");
        User2 user4 = new User2("Lisa Jane");
        System.out.println(user3.getFullName());
        System.out.println(user4.getFullName());

        //Text Formatting Without Flyweight
        FormattedText ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);

        //Text Formatting With Flyweight
        BetterFormattedText bft = new BetterFormattedText("This is not a brave new world");
        bft.getRange(13, 18).capitalize = true;
        System.out.println(bft);
    }
}
