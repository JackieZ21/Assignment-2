package mru.toy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mru.tsc.model.Puzzle;

class Puzzletest {
	Puzzle pz = new Puzzle(null, null, null, null, null, null, null);

	/**
	 * this test is testing the to string method
	 */
	@Test
	void toStringtestPuzzle() {
		String puzzleType = "riddle";
		Puzzle puzzle = new Puzzle(null, null, null, null, null, null, puzzleType);

		assertEquals("puzzle Type:" + puzzleType, puzzle.PuzzleToString());

	}

}