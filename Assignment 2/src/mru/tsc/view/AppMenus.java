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
	public void ExitBanner() {
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
	public String AddSerialNumber() {
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
	public String AddtoyName() {
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
	public String AddtoyBrand() {
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
	public String AddtoyPrice() {
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
	public String AddtoyAvailability() {
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
	public String AddtoyAppropriate() {
		String toyAppropriate;
		System.out.println("enter toy age appropriation: ");
		toyAppropriate = input.nextLine();
		return toyAppropriate;
	}

}
