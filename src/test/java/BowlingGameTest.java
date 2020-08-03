import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void should_get_score_of_pins_in_one_frame_when_no_strike_nor_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getOneFrameScore(5, 6);
        assertEquals(11, score);
    }
}
