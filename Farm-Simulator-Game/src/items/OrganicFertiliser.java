package items;

import main.Item;

/**
 * Organic Fertiliser class extending the Item class.
 */
public class OrganicFertiliser extends Item
{
	
	/**
	 * Organic Fertiliser (crop item) constructor.
	 */
	public OrganicFertiliser()
	{
		super("Organic Fertiliser", "Crop", 10.0, 2.0); //Name, type (crop or animal), price, bonus
	}

}
