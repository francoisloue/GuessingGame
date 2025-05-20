package com.epsi.guessinggame;

import org.junit.Test;
import static org.junit.Assert.*;

public class GuessingGameTest {

    @Test
    public void testGuessTooLow() {
        String result = GuessingGame.checkGuess(25, 50);
        assertEquals("too_low", result);
    }

    @Test
    public void testGuessTooHigh() {
        String result = GuessingGame.checkGuess(75, 50);
        assertEquals("too_high", result);
    }

    @Test
    public void testGuessCorrect() {
        String result = GuessingGame.checkGuess(50, 50);
        assertEquals("correct", result);
    }

    @Test
    public void testGuessOutOfBoundsLow() {
        String result = GuessingGame.checkGuess(0, 50);
        assertEquals("out_of_bounds", result);
    }

    @Test
    public void testGuessOutOfBoundsHigh() {
        String result = GuessingGame.checkGuess(150, 50);
        assertEquals("out_of_bounds", result);
    }
}
