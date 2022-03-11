package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;

public class Toys {
	public static final int BOARDGAME = 0;
	public static final int FIGURE = 1;
	public static final int PUZZLE = 2;
	public static final int ANIMAL = 3;

	private ArrayList<Toy> toys = new ArrayList<>();

	/**
	 * this method loads the information from txt file and adds it to the array list
	 * 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException {
		// create the file and location
		File inFile = new File("toys.txt");
		// Scanner to go through the whole toys txt file
		Scanner fileScanner = new Scanner(inFile);
		// while loop scans through each line
		while (fileScanner.hasNextLine()) {
			// Stores the file scanner into a variable
			String toyText = fileScanner.nextLine();
			// variable called to the method
			Toy toy = textToToy(toyText);
			// add the line to the array list
			toys.add(toy);
		}

	}

	/**
	 * This method figures out what classification a toy is
	 * 
	 * @param toyText is what kind of toy it is
	 * @return
	 */
	private Toy textToToy(String toyText) {
		// if the text is identified as a animal toy return it as a animal toy
		if (isAnimal(toyText)) {
			return new Animal(toyText, toyText, toyText, toyText, toyText, toyText, toyText, toyText);
		} else if (isBoardgame(toyText)) {// if the text is identified as a Boardgame toy return it as a Boardgame toy
			return new Boardgame(toyText, toyText, toyText, toyText, toyText, toyText, toyText, toyText);
		} else if (isFigure(toyText)) {// if the text is identified as a Figure toy return it as a Figure toy
			return new Figure(toyText, toyText, toyText, toyText, toyText, toyText, toyText);
		} else if (isPuzzle(toyText)) {// if the text is identified as a Puzzle toy return it as a Puzzle toy
			return new Puzzle(toyText, toyText, toyText, toyText, toyText, toyText, toyText);
		} else {
			return null;
		}

	}

	/**
	 * This method uses the serial number to figure out if the toy is a puzzle
	 * 
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isPuzzle(String toyText) {
		// Checks the serial number first digit if it is 4,5 or 6
		// to signify if it is a Puzzle
		if (toyText.charAt(0) == 4 || toyText.charAt(0) == 5 || toyText.charAt(0) == 6) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method uses the serial number to figure out if the toy is a figure
	 * 
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isFigure(String toyText) {
		// Checks the serial number first digit if it is 0 and 1
		// to signify if it is a Figure
		if (toyText.charAt(0) == '0' || toyText.charAt(0) == 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method uses the serial number to figure out if the toy is a board game
	 * 
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isBoardgame(String toyText) {
		// Checks the serial number first digit if it is 7,8 or 9
		// to signify if it is a Boardgame
		if (toyText.charAt(0) == 7 || toyText.charAt(0) == 8 || toyText.charAt(0) == 9) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * This method uses the serial number to figure out if the toy is a Animal
	 * 
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isAnimal(String toyText) {
		// Checks the serial number first digit if it is 2 or 3
		// to signify if it is a animal
		if (toyText.charAt(0) == 2 || toyText.charAt(0) == 3) {
			return true;
		} else {
			return false;
		}

	}

	public void Search() {

	}

	/**
	 * add the toys information to ArrayList
	 * 
	 * @param name   of the toy
	 * @param serial number of the toy
	 * @param brand  of the toy
	 * @param price  of the toy
	 * @throws ErrorException
	 */
	public void addToy(Toy TOY) {
		Toy t = TOY;

		int toyType = Toy.toyType(SN);
		if (toyType == BOARDGAME) {
			t = 
		} else if (toyType == FIGURE) {
			t = createFigure();
		} else if (toyType == PUZZLE) {
			t = createPuzzle();
		} else if (toyType == ANIMAL) {
			t = createAnimal();
		}

		toys.add(t);

	}
}
