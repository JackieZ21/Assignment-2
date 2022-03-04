package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Toys {

	private ArrayList<Toy> toys = new ArrayList<>();

	public void load() throws FileNotFoundException {

		File inFile = new File("toys.txt");
		Scanner fileScanner = new Scanner(inFile);

		while (fileScanner.hasNextLine()) {
			String toyText = fileScanner.nextLine();
			Toy toy = textToToy(toyText);
			toys.add(toy);
		}

	}

	private Toy textToToy(String toyText) {
		if (isAnimal(toyText)) {
			return new Animal();
		}
		// if its an Animal
		// return an Animal object
		// else if its a Boardgame
		// return ....
		return null;
	}

	private boolean isAnimal(String toyText) {
		// TODO Auto-generated method stub
		return false;
	}

}
