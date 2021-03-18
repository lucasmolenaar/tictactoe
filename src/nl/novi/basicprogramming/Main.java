package nl.novi.basicprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welkom bij Boter Kaas en Eieren =) \n");

	    // Stap 1: Maak een bord
        Field[] board = new Field[9];

        // board vullen
        for(int i = 0; i < 9; i++) {
            board[i] = new Field(Integer.toString(i));
        }

        // toon het bord
        printBoard(board);

        // maak nieuwe spelers aan
        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Rondje", "O");

        Game game = new Game(playerA, playerB);

        boolean hasWon = false;

        while(!hasWon) {
            // Stap 2: Geef speler de mogelijkheid om een symbol te zetten
            System.out.println("\n Voer een cijfer van 0 t/m 8 in om een " + game.getCurrentPlayer().getName() + " te zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            String currentPlayerToken = game.getCurrentPlayer().getToken();
            board[selectedField].setToken(currentPlayerToken);

            // toon het bord
            printBoard(board);

            // controleer of de speler gewonnen heeft
            hasWon = game.hasPlayerWon(board);

            if (hasWon) {
                game.getCurrentPlayer().setScore(1);
            }

            // wissel van speler
            game.switchPlayer();
        }

        System.out.println("\nSpeler " + playerA.getName() + " heeft een score van " + playerA.getScore());
        System.out.println("Speler " + playerB.getName() + " heeft een score van " + playerB.getScore());
    }

    public static void printBoard(Field[] board) {
        // board in de console printen
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken());

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;

            if (!isEndOfRow) {
                System.out.print(" | ");
            }

            if (isEndOfRow && !isLastField) {
                System.out.println("\n ______");
            }
        }
    }
}

