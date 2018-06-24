package Facade;

public class Demo {

    public static void main(String[] args) {
        //Without A facade impl
        Buffer buffer = new Buffer(30,20);
        ViewPort vp = new ViewPort(buffer,30 , 20 ,0 ,0);
        Console console = new Console(30 ,20);
        console.viewPortList.add(vp);
        console.render();

        //With a Facade
        Console console1 = Console.newConsole(30, 20);
        console1.render();
    }

}
