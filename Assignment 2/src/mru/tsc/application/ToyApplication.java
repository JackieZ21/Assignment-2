package mru.tsc.application;

import mru.tsc.controller.Toy;
import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;

public class ToyApplication {

	public Toy createAnimal(String Serial, String toyName, String toyBrand, String toyPrice, String toyAvailability,
			String toyAppropriate, String material, String size) {
		Toy ANIMAL = new Animal(Serial, toyName, toyBrand, toyPrice, toyAvailability, toyAppropriate, material, size);
		return ANIMAL;
	}

	private Toy createPuzzle(String Serial, String toyName, String toyBrand, String toyPrice, String toyAvailability,
			String toyAppropriate, String puzzleType) {
		Toy Puzzle = new Puzzle(Serial, toyName, toyBrand, toyPrice, toyAvailability, toyAppropriate, puzzleType);
		return Puzzle;
	}

	private Toy createFigure(String Serial, String toyName, String toyBrand, String toyPrice, String toyAvailability,
			String toyAppropriate, String figureType) {
		Toy FIGURE = new Figure(Serial, toyName, toyBrand, toyPrice, toyAvailability, toyAppropriate, figureType);
		return FIGURE;
	}

	/**
	 * 
	 * @param SN             serial number
	 * @param name           of toy
	 * @param brand          of boardGame
	 * @param price          of boardGame
	 * @param avilableCount
	 * @param ageAppropriate for board game
	 * @param numOfPlayer    for boardGame
	 * @param designers      for boardGame
	 * @return
	 */
	public Toy createBoardgame(String SN, String name, String brand, String price, String avilableCount,
			String ageAppropriate, String numOfPlayer, String designers) {
		Toy BOARD_GAME = new Boardgame(SN, name, brand, price, avilableCount, ageAppropriate, numOfPlayer, designers);
		return BOARD_GAME;
	}

	public Toy createToy(String SN) {
		Toy t = null;

		int toyType = Toy.toyType(SN);
		if (toyType == BOARDGAME) {
			t = createBoardgame();
		} else if (toyType == FIGURE) {
			t = createFigure();
		} else if (toyType == PUZZLE) {
			t = createPuzzle();
		} else if (toyType == ANIMAL) {
			t = createAnimal();
		}

	}
}
