package SingletonPattern;

import java.io.*;

public class Demo {

    static void saveToFile(BasicSingleton basicSingleton, String fileName) throws Exception{

        try (FileOutputStream outputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(basicSingleton);
        }
    }

    static BasicSingleton readFromFile(String fileName) throws Exception{
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
           return (BasicSingleton) objectInputStream.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton = BasicSingleton.getINSTANCE();
        singleton.setValue(1234);

        System.out.println("Singleton value is " + singleton.getValue());

        System.out.println(" ");
        // Fix Serialization problem by adding readResolve method in the Object
        String fileName = "singleton.bin";
        saveToFile(singleton,fileName);

        BasicSingleton singleton2 = readFromFile(fileName);

        System.out.println("Are the singletons same ? ");
        System.out.println( singleton == singleton2);

        System.out.println(" ");
        //StaticBlockSingleton can be used to handle exceptions when creating the singleton
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getINSTANCE();

        System.out.println(" ");
        //LazySingleton initializing that is thread safe
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(" ");
        //InnerStatic single can also handle thread safe operations
        InnerStaticSingleton innerStaticSingleton = InnerStaticSingleton.getInstance();

        //Monostate
        System.out.println(" ");
        ChiefExecutingOfficer ceo = new ChiefExecutingOfficer();
        ceo.setName("Adam Smith");
        ceo.setAge("55");
        System.out.println(ceo);
        ChiefExecutingOfficer ceo2 = new ChiefExecutingOfficer();
        System.out.println(ceo2);
    }
}
