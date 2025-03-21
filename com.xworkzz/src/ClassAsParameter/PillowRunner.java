package ClassAsParameter;

public class PillowRunner {
    public static void main(String[] args) {
        Fever fever = new Fever();
        Dolo650 dolo650 = new Dolo650();
        fever.takeIt(dolo650);
        fever.takeIt(null);

    }
}

