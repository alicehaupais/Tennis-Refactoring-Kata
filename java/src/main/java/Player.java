public class Player {

    private String namePlayer;
    private int scorePlayer;

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
        this.scorePlayer = 0;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public int getScore() {
        return scorePlayer;
    }

    public void addOnePoint() {
        this.scorePlayer ++;
    }
}
