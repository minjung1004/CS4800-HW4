package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;

public class VeganProtein implements ProteinFactory{
    private static VeganProtein instance;

    public static VeganProtein getInstance() {
        if (instance == null) {
            instance = new VeganProtein();
        }
        return instance;
    }

    // default
    @Override
    public Food createProtein() {
        return new Tofu();
    }
}
