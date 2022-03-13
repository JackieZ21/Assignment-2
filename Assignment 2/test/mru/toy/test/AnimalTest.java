package mru.toy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.tsc.model.Animal;

class AnimalTest {
	Animal am = new Animal(null, null, null, null, null, null, null, null);

	/**
	 * this test the to string method for the animal class
	 */
	@Test
	void toStringtest() {
		String material = "cloth";
		String size = "s";
		Animal animal = new Animal(null, null, null, null, null, null, material, size);

		assertEquals("animal material:" + material + "\n" + "animal size:" + size, animal.animalToString());

	}

}
