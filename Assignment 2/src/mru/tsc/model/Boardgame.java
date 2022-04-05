package mru.tsc.model;

/**
 * child class extends Toys
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class Boardgame extends Toy {
	private String numOfPlayer;
	private String designer;

	/**
	 * Boardgame constructor calls super and combine Boardgame info
	 * 
	 * @param SN
	 * @param name
	 * @param brand
	 * @param price
	 * @param avilableCount
	 * @param ageAppropriate
	 * @param numOfPlayer
	 * @param designer
	 */
	public Boardgame(String SN, String name, String brand, double price, int avilableCount, String ageAppropriate,
			String numOfPlayer, String designer) {

		super(SN, name, brand, price, avilableCount, ageAppropriate);
		this.numOfPlayer = numOfPlayer;
		this.designer = designer;
	}

	public String toString() {
		return "Boardgame [numOfPlayer=" + numOfPlayer + ", designer=" + designer + "]";
	}

	public String fileString() {
		return (numOfPlayer + ";" + designer);
	}

	/**
	 * method get Number Of Player
	 * 
	 * @return
	 */

	public String getNumOfPlayer() {
		return numOfPlayer;
	}

	/**
	 * method set Number Of Player
	 * 
	 * @param numOfPlayer
	 */
	public void setNumOfPlayer(String numOfPlayer) {
		this.numOfPlayer = numOfPlayer;
	}

	/**
	 * method get Designer
	 * 
	 * @return
	 */
	public String getDesigner() {
		return designer;
	}

	/**
	 * method set Designer
	 * 
	 * @return
	 */
	public void setDesigner(String designer) {
		this.designer = designer;
	}

	/**
	 * method Board game ToString print additional Board game toy info
	 * 
	 * @return
	 */
	public String BoardgameToString() {
		String boardGameNumOfPlayer = "board Game Number Of Player:";
		String boardGameDesigner = "board Game Designer:";

		return (boardGameNumOfPlayer + numOfPlayer + "\n" + boardGameDesigner + designer);

	}
}
