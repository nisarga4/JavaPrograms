package ClassAsParameter;

public class Poster {
    void showInfo() {
        System.out.println("Poster is running");
    }
}

class Theater {
    void show (Poster poster) {
        if (poster != null) {
            poster.showInfo();
        } else {
            System.out.println("Poster is null");
        }
    }
}

