package mru.toy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mru.tsc.model.Figure;

class FigureTest {
	Figure fg = new Figure(null, null, null, null, null, null, null);

	/**
	 * this test the to string method for the figure class
	 */
	@Test
	void toStringtest() {

		String classify = "action";
		Figure figure = new Figure(null, null, null, null, null, null, classify);

		assertEquals("Figure Classification:" + classify, figure.FigureToString());

	}

}