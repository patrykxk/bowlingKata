import org.junit.Before;
import org.junit.Test;

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
        assertThat(game.score(), is(0));
    }

    @Test
    public void tenRolsWithOnePoints_ScoreShouldBeTen() throws Exception {
        game.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void canScoreSpare() throws Exception {
        game.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(game.score(), is(16));
    }

    @Test
    public void canScoreStrike() throws Exception {
        game.roll(10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(game.score(), is(22));
    }

    @Test
    public void scoringPerfectGame() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(), is(300));
    }


}
