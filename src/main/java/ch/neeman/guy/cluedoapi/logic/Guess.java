package ch.neeman.guy.cluedoapi.logic;

import ch.neeman.guy.cluedoapi.Person;
import ch.neeman.guy.cluedoapi.Raum;
import ch.neeman.guy.cluedoapi.Waffe;

/**
 * Represents a guess in the Cluedo game.
 * @param person
 * @param weapon
 * @param room
 */
public record Guess(int person, int weapon, int room) {
}
