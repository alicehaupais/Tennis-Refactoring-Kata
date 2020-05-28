
public class TennisGame3 implements TennisGame {

    private int scorePlayer1;
    private int scorePlayer2;
    private String player1;
    private String player2;
    String[] LABEL = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    String ALL = "All";
    String DEUCE = "Deuce";
    String AVANTAGE = "Advantage ";
    String WIN = "Win for ";

    public TennisGame3(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getLabelScore() {
        return isGameGoingAndSetInferiorTo40_40()
                ? getLabelScoreGameGoing()
                : getLabelScoreEndSetOrGame();
    }

    private boolean isGameGoingAndSetInferiorTo40_40() {
        return scorePlayer1 < 4 && scorePlayer2 < 4 && !(scorePlayer1 + scorePlayer2 == 6);
    }

    private String getLabelScoreGameGoing() {
        String labelScore = LABEL[scorePlayer1] + "-";
        return (scorePlayer1 == scorePlayer2)
                ? labelScore + ALL
                : labelScore + LABEL[scorePlayer2];
    }

    private String getLabelScoreEndSetOrGame() {
        if (scorePlayer1 == scorePlayer2)
            return DEUCE;
        String labelScore = scorePlayer1 > scorePlayer2 ? player1 : player2;
        return ((scorePlayer1 - scorePlayer2)*(scorePlayer1 - scorePlayer2) == 1) ? AVANTAGE + labelScore : WIN + labelScore;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.scorePlayer1 += 1;
        else
            this.scorePlayer2 += 1;
        
    }

}
