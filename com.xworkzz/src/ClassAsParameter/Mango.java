package ClassAsParameter;

public class Mango {
    void take() {
        System.out.println("Dolo650 is running");
    }
}

class Season {
    void takeIt (Dolo650 dolo650) {
        if (dolo650 != null) {
            dolo650.take();
        } else {
            System.out.println("Dolo650 is null");
        }
    }
}

