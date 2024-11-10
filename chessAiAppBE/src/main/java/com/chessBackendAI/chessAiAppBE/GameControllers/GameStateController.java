package com.chessBackendAI.chessAiAppBE.GameControllers;

import com.chessBackendAI.chessAiAppBE.ChessGameService.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameStateController {
    Board board=new Board();

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello")
    public String  postHello(@RequestBody String body){
        return board.boardShow();
    }

}
