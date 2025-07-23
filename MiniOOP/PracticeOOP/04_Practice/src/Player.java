public class Player extends Person {

    private int playerNumber;

    public Player(int playerID, String playerName, int playerNumber) {
        super(playerID, playerName);
        if (playerNumber <= 0 || playerNumber > 99) {
            System.out.println("Input Error!");
            return;
        }
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    @Override
    public void print() {
        System.out.println("The Player ID is : " + getPersonID());
        System.out.println("The Player Name is : " + getPersonName());
        System.out.println("The Player Number is : " + playerNumber);
    }
}