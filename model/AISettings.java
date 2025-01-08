package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AISettings {
    private Integer score = 0;

    private List<Classification> childNodes;

    public void getAIMoving(BoardGame boardGame){
        childNodes = new ArrayList<>();

        var startTime = System.nanoTime();
        minimax(boardGame, EnumPlayer.AI);

        var move = getBestMove();

        board.updateBoard(move, EnumPlayer.AI);
        var endTime = System.nanoTime();

        var formatter = new DecimalFormat("#.##");
        var difference = (endTime - startTime) / 1e6;
        System.out.println("Vez da I.A em:").concat(formatter.format(difference).concat("s"));
        System.out.println("-------------------------------");
    }
}
