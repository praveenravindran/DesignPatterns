package chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Args> {
    int key;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler){
        int i = key;
        handlers.put(key++, handler);
        return i;
    }

    public void unsubscrile(int key){
        handlers.remove(key);
    }

    public void fire(Args args){
        for(Consumer handler: handlers.values()){
            handler.accept(args);
        }
    }
}
