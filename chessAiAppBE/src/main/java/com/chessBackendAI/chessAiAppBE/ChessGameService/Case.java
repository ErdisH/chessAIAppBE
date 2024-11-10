package com.chessBackendAI.chessAiAppBE.ChessGameService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value //met tout en private final + genere getter+setter+toString+hash etc
@AllArgsConstructor //constructeur avec tous les arguments (ligne et colonne)
@Builder
public class Case {
    int line;
    int column;

    public boolean isValid(int line, int column) {
        return (line > -1 && line < 9) && (column > -1 && column < 9);
    }
}
