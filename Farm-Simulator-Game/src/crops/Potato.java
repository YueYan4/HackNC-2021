package crops;

import main.Crop;

/**
 * Potato class extending the Crop class. 
 */
public class Potato extends Crop
{

    /**
     * Potato constructor.
     */
    public Potato()
    {
        super("Potato", 20.0, 50.0, 3);//Name, buy price, sell price, days to grow(harvestDays)
    }

}