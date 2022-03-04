package mru.tsc.view;

import java.util.Scanner;

/**
 * this class contains the menus for the program
 * @author Jackie Zheng Obayda Daoud
 *March 1,2022
 */
public class AppMenus {
	/**
	 * This method greets user and prints out their options
	 * @return the user input number
	 */
	Scanner input;
	/**
	 * constructor instantiates the scanner
	 */
	public AppMenus(){
		input=new Scanner(System.in);
		
	}
	/**
	 * welcome banner prompt when entering store
	 */
	public void WelcomeBanner() {
		String welcome="Welcome to our toy store!";
		System.out.println(welcome);
		for(int i= 0; i<25;i++) {
			System.out.print("-");
		}
	}
	/**
	 * This method greets user and prints out their options
	 * with input validation to only input numbers
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
		//prints out users options to choose from 
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Please enter a valid choice");
		}
		option=input.nextInt();
		return option;
		
	}
	/**
	 * This method shows user search options
	 * with input validation to only input numbers
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
		//prints out users options to choose from 
		while(!input.hasNextInt()) {
			input.next();
			System.out.println("Please enter a valid choice");
		}
		option=input.nextInt();
		return option;
		
	}
	
}
