package mru.tsc.model;

/**
 * child class extends Toys
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class Puzzle extends Toy {
	private String puzzleType;

	/**
	 * Figure constructor calls super and combine Figure info
	 * 
	 * @param Serial        Number
	 * @param name
	 * @param brand
	 * @param price
	 * @param avilableCount
	 * @param ageAppropriat
	 * @param puzzleType
	 */
	public Puzzle(String SN, String name, String brand, double price, int avilableCount, String ageAppropriate,
			String puzzleType) {

		super(SN, name, brand, price, avilableCount, ageAppropriate);
		this.puzzleType = puzzleType;
	}

	/**
	 * method print to the file
	 * 
	 * @return puzzleType
	 */
	public String fileString() {
		return (puzzleType);
	}

	/**
	 * method get Puzzle Type
	 * 
	 * @return
	 */
	public String getPuzzleType() {
		return puzzleType;
	}

	/**
	 * method set Puzzle Type
	 * 
	 * @param puzzleType
	 */
	public void setPuzzleType(String puzzleType) {
		this.puzzleType = puzzleType;
	}

	public String toString() {
		return "Puzzle [puzzleType=" + puzzleType + "]";
	}

}
