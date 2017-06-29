package com.example.michaelrobertson.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 28/06/2017.
 */

public class UserTest {

    User user;

    @Before
    public void before() {
       user = new User("Jim", 6);
    }

    @Test
    public void getUserName() {
        assertEquals("Jim", user.getName());
    }

    @Test
    public void canChangeName() {
        user = new User("Dennis", 5);
        assertEquals("Dennis", user.setName("Dennis"));
    }

    @Test
    public void checkLives() {
        assertEquals(6, user.getLives());
    }

    @Test
    public void canLooseLife() {
        assertEquals(5, user.looseLife());
    }
}
