package ch.neeman.guy.cluedoapi.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    @Test
    void setupNewGame() {
    }

    @Test
    void evaluateGuess() {
    }

    @Test
    void testSetupNewGame() {
    }

    @Test
    void testEvaluateGuessCorrect() {
        Crime crime = new Crime(1, 2, 1);
        Guess guess = new Guess(1, 2, 1);
        GameLogic logic = new GameLogic();

        int numberOfAttempts = 0;
        int maxNumberOfAttempts = 8;

        GameResult result = logic.evaluateGuess(guess, crime, numberOfAttempts, maxNumberOfAttempts);

        assertEquals(GameState.WON, result.state());
        assertTrue(result.message().equals("Sie haben das Rätsel gelöst"));
    }

    @Test
    void evaluateGuessCrimeNotEqualsGuessThenResultCONTINUEand0Correct() {
        Crime crime = new Crime(1, 2, 1);
        Guess guess = new Guess(3, 3, 3);
        GameLogic logic = new GameLogic();

        int numberOfAttempts = 0;
        int maxNumberOfAttempts = 8;

        GameResult result = logic.evaluateGuess(guess, crime, numberOfAttempts, maxNumberOfAttempts);

        assertEquals(GameState.CONTINUE, result.state());
        assertTrue(result.message().equals("Please try again"));
    }
}