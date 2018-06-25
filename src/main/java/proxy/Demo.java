package proxy;

import java.lang.reflect.Proxy;

public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] {itf},
                new Logging(target));
    }

    public static void main(String[] args) {

        // YOu can use dependency injection to return CarProxy when Car is being called
        // Eg:- Protection Proxy
        Car car = new CarProxy(new Driver(12));
        car.drive();

        //Property Proxy
        Creature creature = new Creature();
        creature.setAbility(20);

        //Dynamic Proxy for Logging
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.walk();
        logged.talk();
        logged.talk();
        System.out.println(logged);

    }
}
