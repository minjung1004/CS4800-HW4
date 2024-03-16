package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;

public class PaleoProtein implements ProteinFactory {
    private static PaleoProtein instance;
    private PaleoProtein() {}

    public static PaleoProtein getInstance() {
        if (instance == null) {
            instance = new PaleoProtein();
        }
        return instance;
    }
    @Override
    public Food createProtein() {
        int random = (int) (Math.random() * 2);
        switch (random) {
            case 0:
                return new Fish();
            case 1:
                return new Chicken();
            case 2:
                return new Beef();
            default:
                return null;
        }
    }
}
