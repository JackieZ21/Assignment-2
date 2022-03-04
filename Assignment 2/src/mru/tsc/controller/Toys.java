package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Toys {

	private ArrayList<Toy> toys = new ArrayList<>();
	/**
	 * this method loads the information from txt file 
	 * and adds it to the array list 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException {

		File inFile = new File("toys.txt");
		Scanner fileScanner = new Scanner(inFile);

		while (fileScanner.hasNextLine()) {
			String toyText = fileScanner.nextLine();
			Toy toy = textToToy(toyText);
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
		if (isAnimal(toyText)) {
			return new Animal();
		}else if(isBoardgame(toyText)) {
			return new Boardgame();
		}else if (isFigure(toyText)) {
			return new Figure();
		}else if (isPuzzle(toyText)) {
			return new Puzzle();
		}else {return null;}
		// if its an Animal
		// return an Animal object
		// else if its a Boardgame
		// return ....
		
	}
	/**
	 * This method uses the serial number to figure out 
	 * if the toy is a puzzle
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isPuzzle(String toyText) {
		// Checks the serial number first digit if it is 4,5 or 6
		//to signify if it is a Puzzle
		if(toyText.charAt(0)==4||toyText.charAt(0)==5||toyText.charAt(0)==6) {
			return true;
		}else {
		return false;	
		}
	}
	/**
	 * This method uses the serial number to figure out 
	 * if the toy is a figure
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isFigure(String toyText) {
		// Checks the serial number first digit if it is 0 and 1
		//to signify if it is a Figure
		if(toyText.charAt(0)==0||toyText.charAt(0)==1) {
			return true;
		}else {
		return false;	
		}
	}
	/**
	 * This method uses the serial number to figure out 
	 * if the toy is a board game
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isBoardgame(String toyText) {
		// Checks the serial number first digit if it is 7,8 or 9 
		//to signify if it is a Boardgame
		if(toyText.charAt(0)==7||toyText.charAt(0)==8||toyText.charAt(0)==9) {
			return true;
		}else {
		return false;	
		}
		
	}
	/**
	 * This method uses the serial number to figure out 
	 * if the toy is a Animal
	 * @param toyText input serial number
	 * @return the toy
	 */
	private boolean isAnimal(String toyText) {
		// Checks the serial number first digit if it is 2 or 3 
		//to signify if it is a animal
		if(toyText.charAt(0)==2||toyText.charAt(0)==3) {
			return true;
		}else {
		return false;	
		}
		
	}

}
