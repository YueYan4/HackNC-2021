package items;

import main.Item;

/**
 * HayBales class extending the Item class.
 */
public class HayBales extends Item
{
	
	/**
	 * Hay Bales (animal item) constructor.
	 */
	public HayBales()
	{
		super("Hay Bales", "Animal", 10.0, 0.4); //Name, type (crop or animal), price, bonus
	}

}
