package com.in28minutes.learnspringframework;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new SuperContraGame(); //1: Object Creation

//        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        //2: Object creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();
    }
}
