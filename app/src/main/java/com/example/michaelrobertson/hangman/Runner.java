package com.example.michaelrobertson.hangman;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class Runner {

    public static void main(String[] args){

        Game game = new Game();
//        Word word = new Word(String word);

        game.chooseAWord();

        game.makeGuess();

        game.play();

}
}

