package Part_2_Macronutrients.Carbs;

import Part_2_Macronutrients.FoodOptions.Bread;
import Part_2_Macronutrients.FoodOptions.Food;
import Part_2_Macronutrients.FoodOptions.Pistachio;

public class PaleoCarbs implements CarbsFactory{
    private static PaleoCarbs instance;

    public static PaleoCarbs getInstance() {
        if (instance == null) {
            instance = new PaleoCarbs();
        }
        return instance;
    }

    // default
    @Override
    public Food createCarbs() {
        return new Pistachio();
    }

}
