package ClassAsParameter;

public class Cricket {
    void run() {
        System.out.println("Cricket is running");
    }
}

class Game {
    void runFast(Cricket cricket) {
        if (cricket != null) {
            cricket.run();
        } else {
            System.out.println("Cricket is null");
        }
    }
}

