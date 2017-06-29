package com.example.michaelrobertson.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class WordTest {


    private Word word;
    private Word word2;

    @Before
    public void before() {
        word = new Word("Church");
        word2 = new Word("Toybox");
    }

    @Test
    public void canGetWord(){
        assertEquals("Church", word.getWord());
    }

    @Test
    public void canSetWord(){
        assertEquals("Toybox", word2.setWord());
    }
}
