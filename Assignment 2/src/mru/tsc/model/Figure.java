package mru.tsc.model;

import mru.tsc.controller.Toy;

/**
 * child class extends Toys
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class Figure extends Toy {
	private String classification;

	/**
	 * Figure constructor calls super and combine Figure info
	 * 
	 * @param Serial         Number
	 * @param name
	 * @param brand
	 * @param price
	 * @param avilableCount
	 * @param ageAppropriat
	 * @param classification
	 */
	public Figure(String SN, String name, String brand, String price, String avilableCount, String ageAppropriate,
			String classification, String Type) {

		super(SN, name, brand, price, avilableCount, ageAppropriate, Type);
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "Figure [classification=" + classification + "]";
	}

	public String fileString() {
		return (classification);
	}

	/**
	 * method get Figure Classification
	 * 
	 * @return
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * method set Figure Classification
	 * 
	 * @param classification
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * method Figure ToString print additional Figure toy info
	 * 
	 * @return
	 */
	public String FigureToString() {
		String FigureClassification = "Figure Classification:";
		return (FigureClassification + classification);

	}
}
