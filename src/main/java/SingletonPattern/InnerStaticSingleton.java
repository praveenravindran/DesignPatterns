package SingletonPattern;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){}

    private static class InnerStaticSingletonImpl{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        System.out.println("Getting an Inner static singleton");
        return InnerStaticSingletonImpl.INSTANCE;
    }
}
