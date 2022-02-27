package crops;

import main.Crop;

/**
 * Pumpkin class extending the Crop class.
 */
public class Pumpkin extends Crop
{

    /**
     * Pumpkin constructor.
     */
    public Pumpkin()
    {
        super("Pumpkin", 20.0, 100.0, 5);//Name, buy price, sell price, days to grow(harvestDays)
    }

}