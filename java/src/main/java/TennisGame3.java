
public class TennisGame3 implements TennisGame {

    private Player player1;
    private Player player2;

    String[] LABEL = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    String ALL = "All";
    String DEUCE = "Deuce";
    String ADVANTAGE = "Advantage ";
    String WIN = "Win for ";

    public TennisGame3(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getLabelScore() {
        return isGameGoingAndSetInferiorTo40_40()
                ? getLabelScoreGameGoing()
                : getLabelScoreEndSetOrGame();
    }

    private boolean isGameGoingAndSetInferiorTo40_40() {
        return player1.getScore() < 4 && player2.getScore() < 4 && !(player1.getScore() + player2.getScore() == 6);
    }

    private String getLabelScoreGameGoing() {
        String labelScore = LABEL[player1.getScore()] + "-";
        return (player1.getScore() == player2.getScore())
                ? labelScore + ALL
                : labelScore + LABEL[player2.getScore()];
    }

    private String getLabelScoreEndSetOrGame() {
        return (player1.getScore() == player2.getScore())
                ? getLabelEquality()
                : getLabelPlayerMayWin();
    }

    private String getLabelEquality() {
        return DEUCE;
    }

    private String getLabelPlayerMayWin() {
        String playerWithHighestScore = player1.getScore() > player2.getScore()
                ? player1.getNamePlayer()
                : player2.getNamePlayer();

        return isGameStillGoing()
                ? ADVANTAGE + playerWithHighestScore
                : WIN + playerWithHighestScore;
    }

    private boolean isGameStillGoing() {
        return Math.pow((player1.getScore() - player2.getScore()),2) == 1;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.getNamePlayer())
            player1.addOnePoint();
        else
            player2.addOnePoint();
        
    }

}
