package mru.toy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.tsc.controller.Toy;

class ToyTest {

	/**
	 * this test the toy class method that figures out 
	 * what kind of toy from a serial number
	 */
	@Test
	void typeTest() {
		String typeSNtest="456";
		int res=Toy.toyType(typeSNtest);
		assertEquals(2, res);
	}

}
