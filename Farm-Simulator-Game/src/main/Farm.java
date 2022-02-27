package main;
import java.util.ArrayList;

/**
 * Farm class where the users farm gets managed.
 */
public class Farm
{
	
	/**
	 * Farm name String.
	 */
	private String farmName;
	
	/**
	 * Crops owned ArrayList, gets filled with Crops.
	 */
	private ArrayList<Crop> crops = new ArrayList<Crop>();
	
	/**
	 * Animals owned ArrayList, gets filled with Animals.
	 */
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	/**
	 * Items owned ArrayList, gets filled with Items.
	 */
	private ArrayList<Item> items = new ArrayList<Item>();
	
	/**
	 * Money owning.
	 */
	private double money;
	
	/**
	 * Initial money owned when the game started.
	 */
	private double initMoney;
	
	/**
	 * Total crop space available.
	 */
	private int cropSpace;
	
	
	/**
	 * Constructor function for Farm Class, this constructor initialises variables <code>farmName</code> and Sets the farm type.
	 * @param name The name of the farmer.
	 * @param type The type of the farmer in String format.
	 */
	public Farm(String name) 
	{
        farmName = name;
    }
	
	/**
	 * Returns the current available money for the farm.
	 * @return Money available.
	 */
	public double getMoney()
	{
		return money;
	}
	
	/**
	 * Returns the profit the farm has made by subtracting <code>initMoney</code> from <code>money</code>.
	 * @return The profit of the farm.
	 */
	public double getProfit()
	{
		return money - initMoney;
	}
	
	/**
	 * Returns the farm name from the <code>farmName</code> variable.
	 * @return The farm name.
	 */
	public String getFarmName() 
	{
		return farmName;
	}
	
	/**
	 * Returns the crops the farm currently has planted from the crops ArrayList.
	 * @return An ArrayList of crops owned.
	 */
	public ArrayList<Crop> getCrops() 
	{
		return crops;
	}
	
	/**
	 * Returns the animals the farm currently owns from the animals ArrayList.
	 * @return An ArrayList of animals owned.
	 */
	public ArrayList<Animal> getAnimals() 
	{
		return animals;
	}
	
	/**
	 * Returns the items the farm currently owns from the items ArrayList.
	 * @return An ArrayList of items owned.
	 */
	public ArrayList<Item> getItems() 
	{
		return items;
	}
	
	/**
	 * Returns the total crop space the farm has.
	 * @return The crop space.
	 */
	public int getCropSpace() 
	{
		return cropSpace;
	}
	
}