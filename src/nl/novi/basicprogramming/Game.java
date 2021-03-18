package nl.novi.basicprogramming;

public class Game {
    // variabelen
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;

    // constructor
    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;

        currentPlayer = playerA;
    }

    //methodes
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public void switchPlayer() {
        if (currentPlayer == playerA) {
            currentPlayer = playerB;
        } else {
            currentPlayer = playerA;
        }
    }

    public boolean hasPlayerWon(Field[] board) {
        String currentPlayerToken = currentPlayer.getToken();

        // Horizontale opties om te winnen
        if (board[0].getToken() == currentPlayerToken && board[1].getToken()  == currentPlayerToken && board[2].getToken()  == currentPlayerToken) {
            return true;
        }
        if (board[3].getToken()  == currentPlayerToken && board[4].getToken()  == currentPlayerToken && board[5].getToken()  == currentPlayerToken) {
            return true;
        }
        if (board[6].getToken()  == currentPlayerToken && board[7].getToken()  == currentPlayerToken && board[8].getToken()  == currentPlayerToken) {
            return true;
        }

        // Verticale opties om te winnen
        if (board[0].getToken()  == currentPlayerToken && board[3].getToken()  == currentPlayerToken && board[6].getToken()  == currentPlayerToken) {
            return true;
        }
        if (board[1].getToken()  == currentPlayerToken && board[4].getToken()  == currentPlayerToken && board[7].getToken()  == currentPlayerToken) {
            return true;
        }
        if (board[2].getToken()  == currentPlayerToken && board[5].getToken()  == currentPlayerToken && board[8].getToken()  == currentPlayerToken) {
            return true;
        }

        // Diagonale opties om te winnen
        if (board[0].getToken()  == currentPlayerToken && board[4].getToken()  == currentPlayerToken && board[8].getToken()  == currentPlayerToken) {
            return true;
        }
        if (board[6].getToken()  == currentPlayerToken && board[4].getToken()  == currentPlayerToken && board[2].getToken()  == currentPlayerToken) {
            return true;
        }

        return false;
    }


}
