import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Patryk on 2017-06-12.
 */

public class BowlingTest {

    @Test
    public void tenRolsWithZeroPoints_ScoreShouldBeZero() throws Exception {
        Game game = new Game();
        for (int i = 0; i < 10; i++) {
            game.roll(0);
        }
        assertThat(game.score(), is(equalTo(0)));
    }
}
