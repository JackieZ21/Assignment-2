package mru.tsc.application;

import mru.tsc.controller.Toy;
import mru.tsc.controller.Toys;
import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.view.AppMenus;

public class ToyApplication {
	AppMenus AM = new AppMenus();

	/**
	 * This method contains the code that will be the whole game
	 * 
	 * @return
	 */
	public void runStore() {

	}

	public Toy createAnimal() {

		String SN = AM.addSerialNumber();
		String NAME_TOY = AM.addtoyName();
		String TOY_BRAND = AM.addtoyBrand();
		String TOY_PRICE = AM.addtoyPrice();
		String AGE_APPRO = AM.addtoyAppropriate();
		String AVALI_TOY = AM.addtoyAvailability();
		String MATIRAL = AM.materialType();
		String SIZE = AM.toySize();

		Toy ANIMAL = new Animal(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, MATIRAL, SIZE);
		return ANIMAL;
	}

	private Toy createPuzzle() {
		String SN = AM.addSerialNumber();
		String NAME_TOY = AM.addtoyName();
		String TOY_BRAND = AM.addtoyBrand();
		String TOY_PRICE = AM.addtoyPrice();
		String AGE_APPRO = AM.addtoyAppropriate();
		String AVALI_TOY = AM.addtoyAvailability();
		String PUZZLE_TYPE = AM.puzzleType();
		Toy Puzzle = new Puzzle(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, PUZZLE_TYPE);
		return Puzzle;
	}

	private Toy createFigure() {

		String SN = AM.addSerialNumber();
		String NAME_TOY = AM.addtoyName();
		String TOY_BRAND = AM.addtoyBrand();
		String TOY_PRICE = AM.addtoyPrice();
		String AGE_APPRO = AM.addtoyAppropriate();
		String AVALI_TOY = AM.addtoyAvailability();
		String CLASSIFICATION = AM.puzzleType();
		Toy FIGURE = new Figure(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, CLASSIFICATION);
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
	public Toy createBoardgame() {
		String SN = AM.addSerialNumber();
		String NAME_TOY = AM.addtoyName();
		String TOY_BRAND = AM.addtoyBrand();
		String TOY_PRICE = AM.addtoyPrice();
		String AGE_APPRO = AM.addtoyAppropriate();
		String AVALI_TOY = AM.addtoyAvailability();
		String NUM_OF_PLAYER = AM.puzzleType();
		String DESIGNER = AM.puzzleType();

		Toy BOARDGAME = new Boardgame(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, NUM_OF_PLAYER,
				DESIGNER);
		return BOARDGAME;
	}

	public Toy createToy(String SN) {
		Toy t = null;
		int toyType = Toy.toyType(SN);
		if (toyType == Toys.BOARDGAME) {
			t = createBoardgame();
		} else if (toyType == Toys.FIGURE) {
			t = createFigure();
		} else if (toyType == Toys.PUZZLE) {
			t = createPuzzle();
		} else if (toyType == Toys.ANIMAL) {
			t = createAnimal();
		}
		return t;

	}

	// make 3 diffrent methods to search and return new array
	// print
	// user chose index from arraylist
	// buy methode reduce invrntory by 1 from the toy object in the current index .
	//

}
