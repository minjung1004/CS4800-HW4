package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;
import Part_2_Macronutrients.Marconutrients.PaleoFactory;

public class PaleoProtein implements ProteinFactory {
    private static PaleoProtein instance;

    public static PaleoProtein getInstance() {
        if (instance == null) {
            instance = new PaleoProtein();
        }
        return instance;
    }

    // default
    @Override
    public Food createProtein() {
        int random = (int) (Math.random() * 2); // Number of available fat options
        switch (random) {
            case 0:
                return new Fish();
            case 1:
                return new Chicken();
            case 2:
                return new Beef();
            default:
                return null; // Handle error or return a default food
        }
    }
}
