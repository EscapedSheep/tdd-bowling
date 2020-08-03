import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void should_get_score_of_bowls_in_one_frame_when_no_strike_nor_spare_given_twice_throws() {
        int[][] bowls = new int[][]{{5,6}, {3,5}, {2,7},{8,8},{4,9},{3,2},{1,1},{2,4},{2,5},{3,5}};
        BowlingGame bowlingGame = new BowlingGame(bowls);
        int[] score = bowlingGame.getScore();
        assertArrayEquals(new int[]{11,8,9,16,13,5,2,6,7,8}, score);
    }
}
