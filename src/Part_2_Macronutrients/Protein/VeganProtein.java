package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;

public class VeganProtein implements ProteinFactory{
    private static VeganProtein instance;
    private VeganProtein() {}

    public static VeganProtein getInstance() {
        if (instance == null) {
            instance = new VeganProtein();
        }
        return instance;
    }

    @Override
    public Food createProtein() {
        return new Tofu();
    }
}
