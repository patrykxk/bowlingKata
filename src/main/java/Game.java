/**
 * Created by Patryk on 2017-06-12.
 */
public class Game {
    private int roll = 0;
    private int[] rolls = new int[21];

    public void roll(int pins) {
        rolls[roll++] = pins;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(rolls[cursor] + rolls[cursor+1]==10){
                score +=10 + rolls[cursor+2];
                cursor +=2;
            }else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }
        return score;
    }
}
