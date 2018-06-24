package Facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
    public List<ViewPort> viewPortList = new ArrayList<>();
    int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Console newConsole(int width, int height){
        Buffer buffer = new Buffer(width, height);
        ViewPort viewPort = new ViewPort(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewPort(viewPort);
        return console;
    }

    public void addViewPort(ViewPort viewPort) {
        viewPortList.add(viewPort);
    }

    public void render() {
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                for (ViewPort vp : viewPortList) {
                    System.out.println(vp.charAt(x, y));
                }
                System.out.println(System.lineSeparator());
            }
        }
    }
}
