public class Player {

    private String playerName;
    private int playerNumber;

    public Player(String playerName, int playerNumber) {
        if (playerName.length() < 5 || playerNumber <= 0) {
            System.out.println("Input Error!");
        } else {
            this.playerName = playerName;
            this.playerNumber = playerNumber;
        }
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void print() {
        if (playerName.length() < 5 || playerNumber <= 0) {
            return;
        } else {
            System.out.println("Player Name : " + playerName);
            System.out.println("Player Number : " + playerNumber);
        }
    }
}