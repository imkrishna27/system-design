package org.example.design_patterns_interview.design_tic_to_toe;

public class TickTocToeMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
