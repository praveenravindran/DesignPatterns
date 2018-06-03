package abstractFactory;

public class Tea implements HotDrink{

    @Override
    public void consume() {
        System.out.println("The tea is nice, I'd prefer it with milk");
    }
}
