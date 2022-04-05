package mru.tsc.application;

import java.io.IOException;
import java.util.ArrayList;

import mru.tsc.controller.Toys;
import mru.tsc.model.Animal;
import mru.tsc.model.Boardgame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;
import mru.tsc.view.AppMenus;

/**
 * This class contains Toy Application that put the program togather
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class ToyApplication {
	AppMenus APPMENU = new AppMenus();
	Toys toys = new Toys();

	/**
	 * This method contains the code that will be the whole game
	 * 
	 * @throws IOException
	 */
	public void runStore() throws IOException {
		boolean exit = false;
		while (exit == false) //
		{
			toys.load();
			APPMENU.WelcomeBanner();

			String y = APPMENU.showMainMenu();

			switch (y) {
			case "1":

				// search and remove toy
				String p = APPMENU.showSearchMenu();
				switch (p) {
				case "1":
					serialNumPurchaseHandler();
					break;
				case "2":
					NamePurchaseHandler();
					break;
				case "3":
					typePurchaseHandler();
					break;
				case "4":
					APPMENU.exitBanner();
					break;

				}
				// add search method
				// use showSearchMenu method to go to the 3 search methods

				break;
			case "2":

				createToy();
				break;
			case "3":

				removeToy();

				break;
			case "4":
				APPMENU.exitBanner();
				exit = true;
				break;

			}
		}
		while (exit == true)
			; // loops to the sign in page

	}

//===============================================================================================================================================================
	// add methods

	/**
	 * method create animal toy object
	 * 
	 * @return Animal object
	 */
	public Toy createAnimal(String SerialNum) {

		String SN = SerialNum;
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		double toyPrice = Double.parseDouble(TOY_PRICE);
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		int avalibleCoun = Integer.parseInt(AVALI_TOY);
		String MATIRAL = APPMENU.materialType();
		String SIZE = APPMENU.toySize();
		Toy ANIMAL = new Animal(SN, NAME_TOY, TOY_BRAND, toyPrice, avalibleCoun, AGE_APPRO, MATIRAL, SIZE);
		return ANIMAL;
	}

	/**
	 * method create puzzle toy object
	 * 
	 * @return puzzle object
	 */
	private Toy createPuzzle(String SerialNum) {
		String SN = SerialNum;
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		double toyPrice = Double.parseDouble(TOY_PRICE);
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		int avalibleCoun = Integer.parseInt(AVALI_TOY);
		String PUZZLE_TYPE = APPMENU.puzzleType();
		Toy Puzzle = new Puzzle(SN, NAME_TOY, TOY_BRAND, toyPrice, avalibleCoun, AGE_APPRO, PUZZLE_TYPE);
		return Puzzle;
	}

	/**
	 * method create FIGURE toy object
	 * 
	 * @return FIGURE object
	 */
	private Toy createFigure(String SerialNum) {

		String SN = SerialNum;
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		double toyPrice = Double.parseDouble(TOY_PRICE);
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		int avalibleCoun = Integer.parseInt(AVALI_TOY);
		String CLASSIFICATION = APPMENU.CLASSIFICATION();

		Toy FIGURE = new Figure(SN, NAME_TOY, TOY_BRAND, toyPrice, avalibleCoun, AGE_APPRO, CLASSIFICATION);
		return FIGURE;
	}

	/**
	 * method create BOARD GAME toy object
	 * 
	 * @return BOARD GAME object
	 */
	public Toy createBoardgame(String SerialNum) {
		String SN = SerialNum;
		String NAME_TOY = APPMENU.addtoyName();
		String TOY_BRAND = APPMENU.addtoyBrand();
		String TOY_PRICE = APPMENU.addtoyPrice();
		double toyPrice = Double.parseDouble(TOY_PRICE);
		String AGE_APPRO = APPMENU.addtoyAppropriate();
		String AVALI_TOY = APPMENU.addtoyAvailability();
		int avalibleCoun = Integer.parseInt(AVALI_TOY);
		String NUM_OF_PLAYER = APPMENU.numOfPlayers();
		String Disigner = APPMENU.boardGameDesigner();

		Toy BOARDGAME = new Boardgame(SN, NAME_TOY, TOY_BRAND, toyPrice, avalibleCoun, AGE_APPRO, NUM_OF_PLAYER,
				Disigner);
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
			t = createBoardgame(SN);
		} else if (toyType == Toy.toyType(SN)) {
			t = createFigure(SN);
		} else if (toyType == Toy.toyType(SN)) {
			t = createPuzzle(SN);
		} else if (toyType == Toy.toyType(SN)) {
			t = createAnimal(SN);
		}

		APPMENU.Added();
		return t;

	}

//======================================================================================================================================================
	// search methods

	public void serialNumPurchaseHandler() {
		ArrayList<Toy> matchingToys = SearchToySerialNum();
		String choosenToy = APPMENU.chooseToy(matchingToys);
		int toyIndex = Integer.parseInt(choosenToy);
		Toy theToy = matchingToys.get(toyIndex);
		theToy.buy();

		APPMENU.Purchased();
	}

	/**
	 * this method searches the array list by serial number
	 * 
	 * @return toys.searchSerialNum(nameToy);
	 */
	public ArrayList<Toy> SearchToySerialNum() {
		String nameToy = APPMENU.addSerialNumber();
		return toys.searchSerialNum(nameToy);
	}

	public void NamePurchaseHandler() {
		ArrayList<Toy> matchingToys = SearchToyName();
		String choosenToy = APPMENU.chooseToy(matchingToys);
		int toyIndex = Integer.parseInt(choosenToy);
		toyIndex--;
		Toy theToy = matchingToys.get(toyIndex);
		theToy.buy();
		APPMENU.Purchased();
	}

	/**
	 * this method searches the array list by name
	 * 
	 * @param toys
	 * @return toy object
	 */
	public ArrayList<Toy> SearchToyName() {
		String nameToy = APPMENU.addtoyName();
		return toys.searchName(nameToy);
	}

	/**
	 * 
	 */
	public void typePurchaseHandler() {
		ArrayList<Toy> matchingToys = SearchToyName();
		String choosenToy = APPMENU.chooseToy(matchingToys);
		int toyIndex = Integer.parseInt(choosenToy);
		Toy theToy = matchingToys.get(toyIndex);
		theToy.buy();
		APPMENU.Purchased();
	}

	/**
	 * this method searches the array list by Type
	 * 
	 * @param toys
	 * @return toy object
	 */

	public ArrayList<Toy> SearchToyType() {
		String nameToy = APPMENU.typeofToy();
		return toys.searchToyType(nameToy);
	}

//===============================================================================================================================================================
	// remove methods

	/**
	 * remove toy object from array
	 * 
	 * @param toys
	 * 
	 */
	public void remove() {
		ArrayList<Toy> matchingToys = removeToy();
		String choosenOP = APPMENU.removeTheToy(matchingToys);
		Toy Index;
		if (choosenOP == "y" || choosenOP == "Y") {
			Index = (matchingToys.get(0));
			APPMENU.removeSerialNumber();
			toys.removeToy(Index);

		} else {
			removeToy();
		}

	}

	public ArrayList<Toy> removeToy() {
		String SN = APPMENU.removeSerialNumber();
		return toys.searchAndRemoveToy(SN);
	}

}
