package SingletonPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws Exception {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton INSTANCE;

    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("Error when creating Singleton");
        }
    }

    public static StaticBlockSingleton getINSTANCE() {
        return INSTANCE;
    }
}
