package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;

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
		File inFile = new File("res\\toys.txt");
		// Scanner to go through the whole toys txt file
		Scanner fileScanner = new Scanner(inFile);
		// while loop scans through each line
		while (fileScanner.hasNextLine()) {
			// Stores the file scanner into a variable
			String toyText = fileScanner.nextLine();
			// variable called to the method
			Toy toy = textToToy(toyText); // add the line to the array list
			toys.add(toy);

		}
		fileScanner.close();

	}

	/**
	 * This method figures out what classification a toy is
	 * 
	 * @param toyText is what kind of toy it is
	 * @return
	 */
	private Toy textToToy(String toyText) {
		// if the text is identified as a animal toy return it as a animal toy
		String[] output = toyText.split(";");

		if (isAnimal(toyText)) {
			String SN = output[0];
			String name = output[1];
			String brand = output[2];
			String Price = output[3];
			double price = Double.parseDouble(Price);
			String avalibleCoun = output[4];
			int avilableCount = Integer.parseInt(avalibleCoun);
			String ageAppropriate = output[5];
			String material = output[6];
			String size = output[7];
			return new Animal(SN, name, brand, price, avilableCount, ageAppropriate, material, size);
		} else if (isBoardgame(toyText)) {// if the text is identified as a Boardgame toy return it as a Boardgame toy
			String SN = output[0];
			String name = output[1];
			String brand = output[2];
			String Price = output[3];
			double price = Double.parseDouble(Price);
			String avalibleCoun = output[4];
			int avilableCount = Integer.parseInt(avalibleCoun);
			String ageAppropriate = output[5];
			String numOfPlayer = output[6];
			String designer = output[7];
			return new Boardgame(SN, name, brand, price, avilableCount, ageAppropriate, numOfPlayer, designer);
		} else if (isFigure(toyText)) {// if the text is identified as a Figure toy return it as a Figure toy
			String SN = output[0];
			String name = output[1];
			String brand = output[2];
			String Price = output[3];
			double price = Double.parseDouble(Price);
			String avalibleCoun = output[4];
			int avilableCount = Integer.parseInt(avalibleCoun);
			String ageAppropriate = output[5];
			String classification = output[6];
			return new Figure(SN, name, brand, price, avilableCount, ageAppropriate, classification);
		} else {// if the text is identified as a Puzzle toy return it as a Puzzle toy
			String SN = output[0];
			String name = output[1];
			String brand = output[2];
			String Price = output[3];
			double price = Double.parseDouble(Price);
			String avalibleCoun = output[4];
			int avilableCount = Integer.parseInt(avalibleCoun);
			String ageAppropriate = output[5];
			String type = output[6];
			return new Puzzle(SN, name, brand, price, avilableCount, ageAppropriate, type);
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
		if (toyText.charAt(0) == '0' || toyText.charAt(0) == '1') {
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
		if (toyText.charAt(0) == '7' || toyText.charAt(0) == '8' || toyText.charAt(0) == '9') {
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
		if (toyText.charAt(0) == '2' || toyText.charAt(0) == '3') {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * add the toys information to ArrayList
	 * 
	 * @param name   of the toy
	 * @param serial number of the toy
	 * @param brand  of the toy
	 * @param price  of the toy
	 */
	public void addToy(Toy t) {

		toys.add(t);

	}

	public void removeToy(Toy index) {
		toys.remove(index);
	}

	/**
	 * 
	 * @param nameToy
	 * @return
	 */
	public ArrayList<Toy> searchName(String nameToy) {
		ArrayList<Toy> result = new ArrayList<>();
		for (Toy currentToy : toys) {
			if (currentToy.getName().contains(nameToy)) {

				result.add(currentToy);

			}
		}

		return result;

	}

	/**
	 * search SN
	 * 
	 * @param nameToy
	 * @return
	 */
	public ArrayList<Toy> searchSerialNum(String nameToy) {
		ArrayList<Toy> result = new ArrayList<>();
		for (Toy currentToy : toys) {
			if (currentToy.getSN().contains(nameToy)) {

				result.add(currentToy);

			}
		}

		return result;

	}

	/**
	 * search Toy Type
	 * 
	 * @param nameToy
	 * @return
	 */
	public ArrayList<Toy> searchToyType(String nameToy) {
		ArrayList<Toy> result = new ArrayList<>();
		for (Toy currentToy : toys) {
			if (currentToy.getName().contains(nameToy)) {

				result.add(currentToy);

			}
		}

		return result;

	}

	public ArrayList<Toy> searchAndRemoveToy(String nameToy) {
		ArrayList<Toy> result = new ArrayList<>();
		for (Toy currentToy : toys) {
			if (currentToy.getSN().contains(nameToy)) {

				result.add(currentToy);

			}
		}

		return result;

	}

	/**
	 * save method print the ArryList into file
	 * 
	 * @throws IOException
	 */
	public void save() throws IOException {

		FileWriter writer = new FileWriter("output.txt");
		for (Toy toy : toys) {
			writer.write(toy + System.lineSeparator());
		}
		writer.close();
	}
}
