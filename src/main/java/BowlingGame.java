public class BowlingGame {
    private int[][] bowls;
    private int[] scores;

    public BowlingGame(int[][] bowls) {
        this.bowls = bowls;
        this.scores = new int[10];
    }

    public int[] getScore() {
        calculateScore();
        return scores;
    }

    private void calculateScore() {
        for (int i = 0; i < 10; i++) {
            int tempScore = bowls[i][0] + bowls[i][1];
            scores[i] = tempScore;
            if (tempScore == 10)
                scores[i] += bowls[i+1][0];
        }
    }



}
