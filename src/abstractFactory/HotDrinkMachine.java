package abstractFactory;

import java.util.Dictionary;
import java.util.Hashtable;

public class HotDrinkMachine {

    public enum AvailableDrink{
        COFFEE, TEA;
    }

    private Dictionary<AvailableDrink, HotDrinkFactory> factories = new Hashtable();

    public HotDrinkMachine() throws Exception {
        for (AvailableDrink availableDrink : AvailableDrink.values()){
            String s = availableDrink.name();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("abstractFactory."+factoryName+"Factory");
            factories.put(availableDrink, (HotDrinkFactory)factory.getDeclaredConstructor().newInstance());
        }
    }

    public HotDrink makeDrink(AvailableDrink drink, int amount)
    {
        return factories.get(drink).prepare(amount);
    }
}
