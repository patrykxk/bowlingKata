/**
 * Created by Patryk on 2017-06-12.
 */
public class Game {

    private int score;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
