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
        game.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(game.score(), is(equalTo(0)));
    }

    @Test
    public void tenRolsWithOnePoints_ScoreShouldBeTen() throws Exception {
        game.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertThat(game.score(), is(equalTo(20)));
    }

    @Test
    public void rollSpare() throws Exception {
        game.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(game.score(), is(equalTo(16)));
    }


}
