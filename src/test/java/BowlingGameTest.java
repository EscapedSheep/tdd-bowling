import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void should_get_score_when_pin_given_bowls_of_each_throws() {
        int[][] bowls = new int[][]{{5,3}, {3,5}, {2,7},{8,1},{4,2},{3,2},{1,1},{2,4},{2,5},{3,5}};
        BowlingGame bowlingGame = new BowlingGame(bowls);
        int[] score = bowlingGame.getScore();
        assertArrayEquals(new int[]{8,8,9,9,6,5,2,6,7,8}, score);
    }

    @Test
    void should_get_score_when_pin_and_spare_given_bowls_of_each_throws() {
        int[][] bowls = new int[][]{{5,5}, {3,5}, {2,7},{8,2},{4,1},{3,7},{1,1},{2,4},{2,5},{3,7},{1}};
        BowlingGame bowlingGame = new BowlingGame(bowls);
        int[] score = bowlingGame.getScore();
        assertArrayEquals(new int[]{13,8,9,14,5,11,2,6,7,11}, score);
    }
}
