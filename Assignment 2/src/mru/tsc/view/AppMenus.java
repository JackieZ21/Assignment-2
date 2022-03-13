package mru.tsc.view;

import java.util.Scanner;

/**
 * this class contains the menus for the program
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class AppMenus {
	/**
	 * This method greets user and prints out their options
	 * 
	 * @return the user input number
	 */
	Scanner input;

	/**
	 * constructor instantiates the scanner
	 */
	public AppMenus() {
		input = new Scanner(System.in);

	}

	/**
	 * welcome banner prompt when entering store
	 */
	public void WelcomeBanner() {
		String welcome = "Welcome to our toy store!";
		System.out.println(welcome);
		for (int i = 0; i < 25; i++) {
			System.out.print("-");
		}
	}

	/**
	 * This method greets user and prints out their options with input validation to
	 * only input numbers
	 * 
	 * @return the user input number
	 */
	public int showMainMenu() {
		int option;
		System.out.println("How can we help you ?\n");
		System.out.println("\t(1). Search  Inventory and Purchase Toy");
		System.out.println("\t(2). Add new Toy");
		System.out.println("\t(3). Remove Toy");
		System.out.println("\t(4). Save and Exit\n");
		System.out.print("Enter a number choice: ");
		// prints out users options to choose from
		while (!input.hasNextInt()) {
			input.next();
			System.out.println("Please enter a valid choice");
		}
		option = input.nextInt();
		return option;

	}

	/**
	 * This method shows user search options with input validation to only input
	 * numbers
	 * 
	 * @return the user input number
	 */
	public int showSearchMenu() {
		int option;
		System.out.println("Find Toys With :\n");
		System.out.println("\t(1). Serial Number(SN)");
		System.out.println("\t(2). Toy name");
		System.out.println("\t(3). Type of toy");
		System.out.println("\t(4). Back to main menu\n");
		System.out.print("Enter a number choice here: ");
		// prints out users options to choose from
		while (!input.hasNextInt()) {
			input.next();
			System.out.println("Please enter a valid choice");
		}
		option = input.nextInt();
		return option;

	}

	/**
	 * Exit banner prompt when entering store
	 */
	public void exitBanner() {
		String welcome = "thank you for Vissiting us!";
		System.out.println(welcome);
		for (int i = 0; i < 25; i++) {
			System.out.print("-");
		}
	}

	/**
	 *
	 * this method saves new toy info to array
	 * 
	 * @return array
	 */
	public String addSerialNumber() {
		String Serial;
		System.out.println("enter serial Number: ");
		Serial = input.nextLine();
		return Serial;

	}

	/**
	 * this method Prompt the user for toy brand and save it into variable
	 * 
	 * @return toy name
	 */
	public String addtoyName() {
		String toyName;
		System.out.println("enter toy Name: ");
		toyName = input.nextLine();
		return toyName;

	}

	/**
	 * this method Prompt the user for toy brand and save it into variable
	 * 
	 * @return the toy brand
	 */
	public String addtoyBrand() {
		String toyBrand;
		System.out.println("enter toy brand: ");
		toyBrand = input.nextLine();
		return toyBrand;
	}

	/**
	 * this method Prompt the user for toy price and save it into variable
	 * 
	 * @return toy price
	 */
	public String addtoyPrice() {
		String toyPrice;
		System.out.println("enter toy price: ");
		toyPrice = input.nextLine();
		return toyPrice;
	}

	/**
	 * this method Prompt the user for toy available count and save it into variable
	 * 
	 * @return toy available count
	 */
	public String addtoyAvailability() {
		String toyAvailability;
		System.out.println("enter toy availible inventory: ");
		toyAvailability = input.nextLine();
		return toyAvailability;
	}

	/**
	 * this method Prompt the user for toy age appropriate and save it into variable
	 * 
	 * @return age appropriate for toy
	 */
	public String addtoyAppropriate() {
		String toyAppropriate;
		System.out.println("enter toy age appropriation: ");
		toyAppropriate = input.nextLine();
		return toyAppropriate;
	}

	/**
	 * this method Prompt the user for toy size and save it into variable
	 * 
	 * @return size of the toy
	 */
	public String toySize() {
		String toySize;
		System.out.println("enter toy size: ");
		toySize = input.nextLine();
		return toySize;
	}

	/**
	 * this method Prompt the user for puzzle type and save it into variable
	 * 
	 * @return puzzle type
	 */
	public String puzzleType() {
		String puzzleType;
		System.out.println("enter puzzle type: ");
		puzzleType = input.nextLine();
		return puzzleType;
	}

	/**
	 * this method Prompt the user for puzzle type and save it into variable
	 * 
	 * @return puzzle type
	 */
	public String boardGameDesigner() {
		String gameDesigner;
		System.out.println("enter toy designer: ");
		gameDesigner = input.nextLine();
		return gameDesigner;
	}

	/**
	 * this method Prompt the user for figure type and save it into variable
	 * 
	 * @return figure type/ classification
	 */
	public String figureType() {
		String figureType;
		System.out.println("enter figure classification: ");
		figureType = input.nextLine();
		return figureType;
	}

	/**
	 * this method Prompt the user for animal type of material and save it into
	 * variable
	 * 
	 * @return animal material
	 */
	public String materialType() {
		String materialType;
		System.out.println("enter material type: ");
		materialType = input.nextLine();
		return materialType;
	}

	/**
	 * this method Prompt the user for number of players and save it into variable
	 * 
	 * @return number of players
	 */
	public String numOfPlayers() {
		String numOfPlayer;
		System.out.println("enter figure classification: ");
		numOfPlayer = input.nextLine();
		return numOfPlayer;
	}

	/**
	 * this method Prompt the user for toy type and save it into variable
	 * 
	 * @return toy type
	 */
	public String typeofToy() {
		String toyType;
		System.out.println("enter the toy type: ");
		toyType = input.nextLine();
		return toyType;
	}
}
