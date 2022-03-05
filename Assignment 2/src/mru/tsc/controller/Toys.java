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
			return new Animal();
		} else if (isBoardgame(toyText)) {// if the text is identified as a Boardgame toy return it as a Boardgame toy
			return new Boardgame();
		} else if (isFigure(toyText)) {// if the text is identified as a Figure toy return it as a Figure toy
			return new Figure();
		} else if (isPuzzle(toyText)) {// if the text is identified as a Puzzle toy return it as a Puzzle toy
			return new Puzzle();
		} else {
			return null;
		}
		// if its an Animal
		// return an Animal object
		// else if its a Boardgame
		// return ....

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
		if (toyText.charAt(0) == 0 || toyText.charAt(0) == 1) {
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
	// array scanner()
	// array search ()

	public void Search() {
		ArrayList Array = new ArrayList(toys);
		Scanner ArrayScanner = new Scanner((Readable) Array);
		while (ArrayScanner.hasNextLine()) {
			// Stores the file scanner into a variable
			String toyText = ArrayScanner.nextLine();
			// variable called to the method
			Toy toy = textToToy(toyText);
		}
	}

	/**
	 * add the toys information to a single line
	 * 
	 * @param name   of the toy
	 * @param serial number of the toy
	 * @param brand  of the toy
	 * @param price  of the toy
	 */
	public void addToy(Toy name, Toy serial, Toy brand, Toy price) {
		toys.add(0, serial);
		toys.add(1, name);
		toys.add(2, brand);
		toys.add(3, price);
		Toy t = new Toy(serial[0], name[1], brand[2], price[3]);

		// add to single line

	}

}
