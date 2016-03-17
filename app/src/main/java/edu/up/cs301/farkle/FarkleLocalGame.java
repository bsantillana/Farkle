package edu.up.cs301.farkle;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import android.util.Log;

/**
 * This contains the state of the local game for the Farkle game.
 *
 * @author Alexa Baldwin
 * @author Levi Banks
 * @author Sara Perkins
 * @author Briahna Santillana
 * @version 15 March 2016
 */
public class FarkleLocalGame extends LocalGame implements FarkleGame {
	@Override
	protected void sendUpdatedStateTo(GamePlayer p) {

	}

	@Override
	protected boolean canMove(int playerIdx) {
		return false;
	}

	@Override
	protected String checkIfGameOver() {
		return null;
	}

	@Override
	protected boolean makeMove(GameAction action) {
		return false;
	}
}// class FarkleLocalGame
