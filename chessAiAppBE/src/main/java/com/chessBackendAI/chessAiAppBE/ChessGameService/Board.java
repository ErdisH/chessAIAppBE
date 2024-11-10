package com.chessBackendAI.chessAiAppBE.ChessGameService;

public class Board {
    private Case[][] board = new Case[8][8];

    public Board() {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                board[i][j] = Case.builder()
                                  .line(i)
                                  .column(j)
                                  .build();
            }
        }
    }
    public String boardShow(){
        return "Board returned here";
    }
}
