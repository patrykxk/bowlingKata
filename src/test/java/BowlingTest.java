import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Patryk on 2017-06-12.
 */

public class BowlingTest {

    private Game game;


    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void tenRolsWithZeroPoints_ScoreShouldBeZero() throws Exception {
        rollMany(20, 0);
        assertThat(game.score(), is(equalTo(0)));
    }

    @Test
    public void tenRolsWithOnePoints_ScoreShouldBeTen() throws Exception {
        rollMany(20, 1);
        assertThat(game.score(), is(equalTo(20)));
    }

    @Test
    public void rollSpare() throws Exception {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(17,0);
        assertThat(game.score(), is(equalTo(16)));
    }


    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }
}
