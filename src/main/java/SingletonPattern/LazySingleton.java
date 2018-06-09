package SingletonPattern;

public class LazySingleton {

    private LazySingleton(){
        System.out.println("Initializing a lazy singleton");
    }

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
