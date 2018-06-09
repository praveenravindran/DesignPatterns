package SingletonPattern;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private BasicSingleton(){

    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getINSTANCE() {
        return INSTANCE;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
