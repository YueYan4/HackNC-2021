package items;

import main.Item;

/**
 * Inorganic Fertiliser class extending the Item class.
 */
public class InorganicFertiliser extends Item
{
	
	/**
	 * Inorganic Fertiliser (crop item) constructor.
	 */
	public InorganicFertiliser()
	{
		super("Inorganic Fertiliser", "Crop", 5.0, 1.0); //Name, type (crop or animal), price, bonus
	}

}
