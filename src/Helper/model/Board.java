package Helper.model;

import java.util.ArrayList;

public class Board {
    private int id;
    ArrayList<Player> players;
    // Variable to assign  id of the player whose turn it is :
    private int playerTurn;
    private int counter;
    private boolean gameOver;


    public Board(int id) {
        this.id = id;

        players = new ArrayList<>();

        // During initialization always add an Ai as the one of the players:
        players.add(new Player(1, "AI", "O"));

        // Assumption that always AI will start the game :
        this.playerTurn = 1;

        // Set the turn counter
        this.counter = 0;

        // Set the state of the game :
        this.gameOver = false;
    }

    /**
     * Getter
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Function to register an opponent against/ Create a player
     *
     * @param opponent
     * @return
     */
    public boolean registerOpponent(Player opponent) {

        // Check if there are the player count is more than one :
        if (players.size() == 1) {
            players.add(opponent);
            return true;
        }
        // If the size is greater than 1 or zero return false:
        return false;
    }

    /**
     * Update the turns of the user:
     *
     * @param id
     * @return boolean
     */
    private boolean myTurn(int id) {
        // Check the player turn to see whose turn is it :
        if (this.playerTurn == id) {
            return true;
        }
        return false;
    }


    /**
     * Update the player turn
     *
     * @param playerId
     */
    public void setTurn(int playerId) {
        this.playerTurn = playerId;

    }


    /**
     * Function to set the values for the user
     *
     * @param id
     * @param value
     */
    public void setValues(int id, int value) {

        // Loop through each user:
        for (Player currentPlayer : players) {

            // Check if the user if the user id is same:
            if (currentPlayer.getId() == id) {

                // Check if it is his turn :
                if (myTurn(id)) {

                    // Register the value :
                    currentPlayer.registerValues(value);
                    counter++;
                }
            }
        }
    }

    private boolean checkGame(Player p) {

        // Check if the game is over without any winners:
        if (this.counter >= 3 && this.counter <= 9) {


        }

    }




}
