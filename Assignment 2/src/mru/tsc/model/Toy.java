package mru.tsc.model;

import mru.tsc.controller.Toys;

/**
 * parent class for other toys
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public abstract class Toy {
// variables needed for each + setter and getter both sub and main 

	private String SN;
	private String name;
	private String brand;
	private double price;
	private int avilableCount;
	private String ageAppropriate;

	/**
	 * toy constructor share common toy info
	 * 
	 * @param Serial   Number
	 * @param name
	 * @param brand
	 * @param price
	 * @param avilable Count
	 * @param age      Appropriate
	 */
	public Toy(String SN, String name, String brand, double price, int avilableCount, String ageAppropriate) {
		this.SN = SN;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.avilableCount = avilableCount;
		this.ageAppropriate = ageAppropriate;

	}

	/**
	 * toString print objects to user
	 */
	public String toString() {
		return "Toy [SN=" + SN + ", name=" + name + ", brand=" + brand + ", price=" + price + ", avilableCount="
				+ avilableCount + ", ageAppropriate=" + ageAppropriate + ", ]";
	}

	/**
	 * method buy, after user buy a game the toy count is decreased by 1
	 * 
	 * @param avilableCount
	 * @return Toy count
	 */
	public int buy() {

		return avilableCount--;

	}

	/**
	 * this class figures out the type of toy from the serial number
	 * 
	 * @param SN serial number of the toy
	 * @return type of toy in an int 0,1,2,3
	 */
	public static int toyType(String SN) {
		if (SN.charAt(0) == '0' || SN.charAt(0) == '1') {
			return Toys.FIGURE;
		} else if (SN.charAt(0) == '2' || SN.charAt(0) == '3') {
			return Toys.ANIMAL;
		} else if (SN.charAt(0) == '4' || SN.charAt(0) == '5' || SN.charAt(0) == '6') {
			return Toys.PUZZLE;
		} else {
			return Toys.BOARDGAME;
		}

	}

	/**
	 * method get serial number
	 * 
	 * @return
	 */
	public String getSN() {
		return SN;
	}

	/**
	 * method set serial number
	 * 
	 * @param sN
	 */
	public void setSN(String sN) {
		SN = sN;
	}

	/**
	 * method get toy Name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * method set toy Name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method get toy Brand
	 * 
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * method set toy Brand
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * method get toy Price
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * method set toy price
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * method get Available Count
	 * 
	 * @return
	 */
	public int getAvilableCount() {
		return avilableCount;
	}

	/**
	 * method set Available Count
	 * 
	 * @param avilableCount
	 */
	public void setAvilableCount(int avilableCount) {
		this.avilableCount = avilableCount;
	}

	/**
	 * method get toy Age Appropriate
	 * 
	 * @return
	 */
	public String getAgeAppropriate() {
		return ageAppropriate;
	}

	/**
	 * method set Age Appropriate
	 * 
	 * @param ageAppropriate
	 */
	public void setAgeAppropriate(String ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}

}
