package ClassAsParameter;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        Cricket cricket = new Cricket();
        game.runFast(cricket);
        game.runFast(null);

    }
}
