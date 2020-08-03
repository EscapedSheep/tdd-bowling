public class BowlingGame {
    private static final int firstThrow = 0;
    private static final int secondThrow = 1;
    private int[][] hitBowls;
    private int[] scores;

    public BowlingGame(int[][] hitBowls) {
        this.hitBowls = hitBowls;
        this.scores = new int[10];
    }

    public int[] getScore() {
        calculateScore();
        return scores;
    }

    private void calculateScore() {
        for (int frame = 0; frame < 10; frame++) {
            if (hitBowls[frame].length == 2) {
                calculatePinOrSpareScore(frame);
            } else {
                calculateStrikeScore(frame);
            }
        }
    }

    private void calculateStrikeScore(int frame) {
        int tempScore = 10;
        int nextThrow = hitBowls[frame + 1][firstThrow];
        tempScore += nextThrow;

        if (nextThrow == 10) {
            tempScore += hitBowls[frame + 2][firstThrow];
        } else {
            tempScore += hitBowls[frame + 1][secondThrow];
        }

        scores[frame] = tempScore;
    }

    private void calculatePinOrSpareScore(int frame) {
        int tempScore = hitBowls[frame][firstThrow] + hitBowls[frame][secondThrow];
        if (tempScore == 10)
            tempScore += hitBowls[frame + 1][firstThrow];

        scores[frame] = tempScore;
    }
}
