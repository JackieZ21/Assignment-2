package mru.tsc.controller;

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
	private String price;
	private String avilableCount;
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
	public Toy(String SN, String name, String brand, String price, String avilableCount, String ageAppropriate) {
		this.SN = SN;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.avilableCount = avilableCount;
		this.ageAppropriate = ageAppropriate;

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
	public String getPrice() {
		return price;
	}

	/**
	 * method set toy price
	 * 
	 * @param price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * method get Available Count
	 * 
	 * @return
	 */
	public String getAvilableCount() {
		return avilableCount;
	}

	/**
	 * method set Available Count
	 * 
	 * @param avilableCount
	 */
	public void setAvilableCount(String avilableCount) {
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

	/**
	 * method MainToString print all common variables between toys
	 */
	public String MainToString() {
		String SerialNum = "serial number:";
		String toyName = "toy name:";
		String toyBrand = "toy brand:";
		String toyPrice = "toy price:"; // variable should be in param ? or call get method? or as is
		String avilableToyCount = "avilable Toy Count:";
		String toyAgeAppropriate = "toy Age Appropriate:";

		return (SerialNum + SN + "\n" + toyName + name + "\n" + toyBrand + brand + "\n" + toyPrice + price + "\n"
				+ avilableToyCount + avilableCount + "\n" + toyAgeAppropriate + ageAppropriate);

	}
}
