package mru.tsc.model;

import mru.tsc.controller.Toy;

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
	public Puzzle(String SN, String name, String brand, String price, String avilableCount, String ageAppropriate,
			String puzzleType) {

		super(SN, name, brand, price, avilableCount, ageAppropriate);
		this.puzzleType = puzzleType;
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

	/**
	 * method Puzzle ToString print additional Puzzle toy info
	 * 
	 * @return
	 */
	public String PuzzleToString() {
		String PuzzleType = "puzzle Type:";
		return (PuzzleType + puzzleType);

	}
}
