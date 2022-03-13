package mru.tsc.application;

import java.io.IOException;
import java.util.ArrayList;

import mru.tsc.controller.Toy;
import mru.tsc.controller.Toys;
import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.view.AppMenus;

/**
 * This class contains Toy Application that put the program togather
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class ToyApplication {
	AppMenus APPMENU = new AppMenus();
	Toys Toys = new Toys();

	/**
	 * This method contains the code that will be the whole game
	 * 
	 * @throws IOException
	 */
	public void runStore() {

		APPMENU.WelcomeBanner();
		int y = APPMENU.showMainMenu();

		switch (y) {
		case 1:
			// search and remove toy
			int p = APPMENU.showSearchMenu();
			switch (p) {
			case 1:
				SearchToySerialNum(toysType);
				break;
			case 2:
				SearchToyName(toysType);
				break;
			case 3:
				SearchToyType(toysType);
				break;
			case 4:
				break;
			}
			// add search method
			// use showSearchMenu method to go to the 3 search methods

			break;
		case 2:

			createToy();
			break;
		case 3:
			// remove toy
			remove(toysType);
			// remove toy(sn)
			break;
		case 4:
			try {
				Toys.save();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			APPMENU.exitBanner();
			break;

		}

	}

	/**
	 * method create animal toy object
	 * 
	 * @return Animal object
	 */
	public Toy createAnimal() {

		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String MATIRAL = APPMENU.materialType();
		String SIZE = APPMENU.toySize();
		String Type = APPMENU.typeofToy();
		Toy ANIMAL = new Animal(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, MATIRAL, SIZE, Type);
		return ANIMAL;
	}

	/**
	 * method create puzzle toy object
	 * 
	 * @return puzzle object
	 */
	private Toy createPuzzle() {
		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String PUZZLE_TYPE = APPMENU.puzzleType();
		String Type = APPMENU.typeofToy();
		Toy Puzzle = new Puzzle(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, PUZZLE_TYPE, Type);
		return Puzzle;
	}

	/**
	 * method create FIGURE toy object
	 * 
	 * @return FIGURE object
	 */
	private Toy createFigure() {

		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String CLASSIFICATION = APPMENU.puzzleType();
		String Type = APPMENU.typeofToy();
		Toy FIGURE = new Figure(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, CLASSIFICATION, Type);
		return FIGURE;
	}

	/**
	 * method create BOARD GAME toy object
	 * 
	 * @return BOARD GAME object
	 */
	public Toy createBoardgame() {
		String SN = APPMENU.addSerialNumber();
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		String NUM_OF_PLAYER = APPMENU.numOfPlayers();
		String Type = APPMENU.typeofToy();
		String Disigner = APPMENU.boardGameDesigner();

		Toy BOARDGAME = new Boardgame(SN, NAME_TOY, AGE_APPRO, AVALI_TOY, TOY_BRAND, TOY_PRICE, NUM_OF_PLAYER, Disigner,
				Type);
		return BOARDGAME;
	}

	/**
	 * method create Toy object based on the serial number and toy type
	 * 
	 * @return
	 */
	public Toy createToy() {
		String SN = APPMENU.addSerialNumber();
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
//======================================================================================================================================================

	ArrayList<Toy> toysType = new ArrayList<>();

	/**
	 * this method searches the array list by serial number
	 * 
	 * @param toys
	 * @return toy object
	 */
	public int SearchToySerialNum(ArrayList<Toy> toys) {
		String SERIAL_NUM = APPMENU.addSerialNumber();
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getSN().contains(SERIAL_NUM)) {

				toysType.add(CURRENT_TOY);
				System.out.println(CURRENT_TOY);
				int index = toys.indexOf(CURRENT_TOY);
				return index;
			}
		}
		return -1;

	}

	/**
	 * this method searches the array list by name
	 * 
	 * @param toys
	 * @return toy object
	 */
	public int SearchToyName(ArrayList<Toy> toys) {
		String NAME_TOY = APPMENU.addtoyName();
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getName().contains(NAME_TOY)) {
				toString();
				toysType.add(CURRENT_TOY);
				int index = toys.indexOf(CURRENT_TOY);
				return index;
			}
		}
		return -1;

	}

	/**
	 * this method searches the array list by Type
	 * 
	 * @param toys
	 * @return toy object
	 */

	public int SearchToyType(ArrayList<Toy> toys) {
		String TOY_TYPE = APPMENU.typeofToy();
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getType().contains(TOY_TYPE)) {
				toysType.add(CURRENT_TOY);
				int index = toys.indexOf(CURRENT_TOY);
				return index;
			}
		}
		return -1;

	}

	/**
	 * method buy after user buy a game the toy count is decreased by 1
	 * 
	 * @param avilableCount
	 * @return Toy count -1
	 */
	public String buy(String avilableCount) {

		String TOY_COUNTI = avilableCount;
		int AVALI_NUM_OF_TOY = Integer.parseInt(TOY_COUNTI);

		AVALI_NUM_OF_TOY--;

		String TOY_COUN = String.valueOf(AVALI_NUM_OF_TOY);
		return TOY_COUN;

	}

	/**
	 * remove toy object from array
	 * 
	 * @param toys
	 */
	public void remove(ArrayList<Toy> toys) {
		String SN = APPMENU.addSerialNumber();
		for (Toy CURRENT_TOY : toys) {
			if (CURRENT_TOY.getSN().contains(SN)) {

				int index = toys.indexOf(CURRENT_TOY);
				toys.remove(index);
				System.out.println("toy removed!!");
			}
		}

	}

	// make 3 diffrent methods to search and return new array
	// print
	// user chose index from arraylist not done
	// buy methode reduce invrntory by 1 from the toy object in the current index .
	//

}
