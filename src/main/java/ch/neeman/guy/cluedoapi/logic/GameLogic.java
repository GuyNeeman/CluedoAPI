package ch.neeman.guy.cluedoapi.logic;

import ch.neeman.guy.cluedoapi.Models;
import org.springframework.stereotype.Component;

@Component
public class GameLogic {

    /**
     * Sets up a new game by randomly selecting the secret crime.
     *
     * @param service the data service that provides the lists of persons, weapons and rooms
     * @return the randomly generated crime consisting of murderer, murder weapon and crime scene
     */
    public Crime setupNewGame(Models service){
        // To be implemented
        return null;
    }

    /**
     * Evaluates the player's guess and determines the current game state.
     *
     * @param guess the guess provided by the player
     * @param crime the secret crime to compare the guess against
     * @param numberOfAttempts the number of attempts the player has already used
     * @param maxNumberOfAttempts the total number of attempts available
     * @return a GameResult indicating whether the player has won, lost or may continue
     */
    public GameResult evaluateGuess(Guess guess, Crime crime, int numberOfAttempts, int maxNumberOfAttempts){
        // To be implemented
        return new GameResult(GameState.CONTINUE, "Please try again");
    }

}
