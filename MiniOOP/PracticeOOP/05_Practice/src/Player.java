public class Player extends SharedData {

    private int playerNumber;

    public Player(int playerID, String playerName, String playerPhone, int playerNumber) {
        super(playerID, playerName, playerPhone);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    @Override
    public void print() {
        System.out.println("The Player ID is : " + getID());
        System.out.println("The Player Name is : " + getName());
        System.out.println("The Player Phone is : " + getPhone());
        System.out.println("The Player Number is : " + playerNumber);
    }
}