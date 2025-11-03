package ch.neeman.guy.cluedoapi.logic;

import ch.neeman.guy.cluedoapi.Person;
import ch.neeman.guy.cluedoapi.Raum;
import ch.neeman.guy.cluedoapi.Waffe;

/**
 * Represents a cluedo crime
 * @param murder
 * @param murderWeapon
 * @param crimeScene
 */
public record Crime(int murder, int murderWeapon, int crimeScene) {
}
