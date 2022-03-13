package mru.tsc.application;

import java.util.ArrayList;

import mru.tsc.controller.Toy;
import mru.tsc.controller.Toys;
import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.view.AppMenus;

public class ToyApplication {
	AppMenus APPMENU = new AppMenus();

	/**
	 * This method contains the code that will be the whole game
	 */
	public void runStore() {

		Toys newtoy = new Toys();
		APPMENU.WelcomeBanner();
		int y = APPMENU.showMainMenu();

		switch (y) {
		case 1:
			// search and remove toy
			int searchMen = APPMENU.showSearchMenu();

			// add search method
			// use showSearchMenu method to go to the 3 search methods

			break;
		case 2:
			String sn = APPMENU.addSerialNumber();
			String name = APPMENU.addtoyName();

			newtoy.addToy(null);
			break;
		case 3:
			// remove toy
			String serial_number = APPMENU.addSerialNumber();
			// remove toy(sn)
			break;
		case 4:
			// save
			// and exit
			break;

		}

	}

	public Toy createAnimal() {

		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String MATIRAL = APPMENU.materialType();
		String SIZE = APPMENU.toySize();

		Toy ANIMAL = new Animal(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, MATIRAL, SIZE);
		return ANIMAL;
	}

	private Toy createPuzzle() {
		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String PUZZLE_TYPE = APPMENU.puzzleType();
		Toy Puzzle = new Puzzle(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, PUZZLE_TYPE);
		return Puzzle;
	}

	private Toy createFigure() {

		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String CLASSIFICATION = APPMENU.puzzleType();
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
		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String NUM_OF_PLAYER = APPMENU.puzzleType();
		String DESIGNER = APPMENU.puzzleType();

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

	/**
	 * this method searches the array list by serial number
	 * 
	 * @param toys
	 * @return toy object
	 */
	public Toy SearchToySerialNum(ArrayList<Toy> toys) {
		String SERIAL_NUM = APPMENU.addSerialNumber();
		System.out.println("Contents of the array list: ");
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getName().contains(SERIAL_NUM)) {
				return CURRENT_TOY;
			}
		}
		return null;

	}

	/**
	 * this method searches the array list by name
	 * 
	 * @param toys
	 * @return toy object
	 */
	public Toy SearchToyName(ArrayList<Toy> toys) {
		String NAME_TOY = APPMENU.addtoyName();
		System.out.println("Contents of the array list: ");
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getName().contains(NAME_TOY)) {
				return CURRENT_TOY;
			}
		}
		return null;

	}

	/**
	 * this method searches the array list by Type
	 * 
	 * @param toys
	 * @return toy object
	 */
	public ArrayList<Toy> SearchToyType(ArrayList<Toy> toys) {
		String TOY_TYPE = APPMENU.typeofToy();
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getName().contains(TOY_TYPE)) {
				ArrayList<Toy> toysType = new ArrayList<>();
				toysType.add(CURRENT_TOY);
				return toysType;
			}
		}
		return null;
	}

	// make 3 diffrent methods to search and return new array
	// print
	// user chose index from arraylist
	// buy methode reduce invrntory by 1 from the toy object in the current index .
	//

}
