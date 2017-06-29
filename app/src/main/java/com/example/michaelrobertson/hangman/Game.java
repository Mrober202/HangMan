package com.example.michaelrobertson.hangman;

import java.util.Scanner;

import static android.R.attr.name;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class Game {

    private Scanner sc;
    private Word word;
    private User user;

    public Game() {
        sc = new Scanner(System.in);
        user = new User("Allen", 6);
    }

    public void chooseAWord() {
        System.out.println("Please choose a new word");
        Scanner wordInput = new Scanner(System.in);
        String wordChoice = wordInput.nextLine();
        System.out.println("The word you chose is " + wordChoice);
        word = new Word(wordChoice);
    }

    public void makeGuess() {
        System.out.println("Please enter the letter you want to guess.");
        Scanner guessInput = new Scanner(System.in);
        String guess = guessInput.nextLine();
        System.out.println(word.checkGuess(guess.charAt(0)));
    }

    public void play() {
        while (user.checkDeath()) {
            System.out.println("You have " + user.lives + " remaining");
            makeGuess();

        }

        System.out.println("The man is dead.");
    }


}
