package abstractFactory;

public class Coffee implements HotDrink{

    @Override
    public void consume() {
        System.out.println("The coffee is nice, I'd prefer it with milk");
    }
}
