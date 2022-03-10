package mru.tsc.model;

import mru.tsc.controller.Toy;

/**
 * child class extends Toys
 * 
 * @author Jackie Zheng Obayda Daoud March 1,2022
 */
public class Animal extends Toy {
	private String material;// private
	private String size;

	/**
	 * Animal constructor calls super and combine animal info
	 * 
	 * @param Serial   Number
	 * @param name
	 * @param brand
	 * @param price
	 * @param avilable Count
	 * @param age      Appropriate
	 * @param material
	 * @param size
	 */
	public Animal(String SN, String name, String brand, String price, String avilableCount, String ageAppropriate,
			String material, String size) {

		super(SN, name, brand, price, avilableCount, ageAppropriate);
		this.material = material;
		this.size = size;
	}

	/**
	 * method get Animal Material
	 * 
	 * @return
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * method set Animal Material
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * method get Animal Size
	 * 
	 * @return
	 */
	public String getSize() {
		return size;
	}

	/**
	 * method set Animal size
	 * 
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * method animal ToString print additional animal toy info
	 * 
	 * @return
	 */
	public String animalToString() {
		String animalMaterial = "animal material:";
		String animalSize = "animal size:";
		return (animalMaterial + material + "\n" + animalSize + size);

	}
}
