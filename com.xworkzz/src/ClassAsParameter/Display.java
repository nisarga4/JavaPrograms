package ClassAsParameter;

public class Display {
    void run() {
        System.out.println("Display is running");
    }
}

class Shop {
    void ads(Display display) {
        if (display != null) {
            display.run();
        } else {
            System.out.println("Display is null");
        }
    }
}

