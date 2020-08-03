public class BowlingGame {
    private int[][] bowls;
    private int[] score;

    public BowlingGame(int[][] bowls) {
        this.bowls = bowls;
        this.score = new int[10];
    }

    public int[] getScore() {
        calculateScore();
        return score;
    }

    private void calculateScore() {
        for (int i = 0; i < bowls.length; i++) {
            score[i] = bowls[i][0] + bowls[i][1];
        }
    }


}
