package com.example.michaelrobertson.hangman;

import static android.R.attr.name;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class User {
//    user should be given 6 lives and loose a life for every wrong guess.

    public String name;
    public int lives = 6;

    public User(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getLives() {
        return lives;
    }

    public int looseLife() {
        lives -= 1;
        return lives;
    }

    public boolean checkDeath() {
        if (lives > 0){
            return true;
        }
        return false;
    }

}
