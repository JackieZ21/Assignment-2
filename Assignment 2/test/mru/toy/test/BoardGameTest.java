package mru.toy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mru.tsc.model.Boardgame;

class BoardGameTest {
	Boardgame bg = new Boardgame(null, null, null, null, null, null, null, null);

	/**
	 * this test the to string method for the boardGame class
	 */
	@Test
	void toStringtest() {

		String numPlayers = "4";
		String designer = "Joe";

		Boardgame bg = new Boardgame(null, null, null, null, null, null, numPlayers, designer);

		assertEquals("board Game Number Of Player:" + numPlayers + "\n" + "board Game Designer:" + designer,
				bg.BoardgameToString());

	}

}