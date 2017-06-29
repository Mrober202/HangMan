package com.example.michaelrobertson.hangman;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class Word {

//    word class only takes in the word for the users to guess letters from

    protected String word;
    public User user;
    protected StringBuilder sb;

    protected Word(String word) {
        this.word = word;
        sb = new StringBuilder();
        user = new User("Allen", 6);
    }

    public String getWord() {
        return word;
    }

    public String setWord() {
        return word;
    }

    public String checkGuess(char guess) {

//        loops through the indexs of each letter in the word and matches the characters based on the index, not the character.
        for (char c : word.toCharArray()) {
            if (c == guess) {
                // apend c to sb
                sb.append(c);
            } else {
                sb.append("*");
                user.looseLife();
            }
        }
        return sb.toString();
    }
}
