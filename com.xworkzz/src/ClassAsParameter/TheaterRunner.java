package ClassAsParameter;

public class TheaterRunner {
    public static void main(String[] args) {
        Theater theater = new Theater();
        Poster poster = new Poster();
        theater.show(poster);
        theater.show(null);

    }
}