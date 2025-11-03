package ch.neeman.guy.cluedoapi.logic;

/**
 * The GameResult
 * @param state  enum, state of the game
 * @param message additional message
 */
public record GameResult(GameState state, String message) {
}
