package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Logging implements InvocationHandler {
    private final Object target;
    private Map<String, Integer> calls = new HashMap<>();

    public Logging(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();

        //You display the methodcallCount when the toString method of the object is called
        if(name.contains("toString")){
            return calls.toString();
        }

        calls.merge(name, 1, Integer::sum);
        return method.invoke(target, args);

    }
}
