package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BoardGame {
    private char[][] gameBoard = {
            { '_', '|', '_', '|', '_' },
            { '_', '|', '_', '|', '_' },
            { ' ', '|', ' ', '|', ' ' }
    };

    public void printBoard() {
        for (char[] row : this.getGameBoard()) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public void updateBoard(Move move, EnumPlayer player) {
        this.getGameBoard()[move.getyAxis()][move.getxAxis()] = player.getValue();

        printBoard();
    }
// terminar logica






}
