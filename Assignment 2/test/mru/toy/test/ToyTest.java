package mru.toy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.tsc.controller.Toy;

class ToyTest {
Toy tc=new Toy();
	/**
	 * this test the toy class method that figures out 
	 * what kind of toy from a serial number
	 */
	@Test
	void typeTest() {
		String typeSNtest="456";
		int res=tc.toyType(typeSNtest);
		assertEquals(2, res);
	}
	/**
	 * this method test a getter for the serial number 
	 * which also uses the set method 
	 */
	@Test
	void getTest() {
		String testSN="1234";
		tc.setSN("1234");
		String getSN=tc.getSN();
		assertEquals(testSN, getSN);
	}
}
