package Part_2_Macronutrients.Carbs;

import Part_2_Macronutrients.FoodOptions.*;

public class VeganCarbs implements CarbsFactory{
    private static VeganCarbs instance;

    public static VeganCarbs getInstance() {
        if (instance == null) {
            instance = new VeganCarbs();
        }
        return instance;
    }

    // default
    @Override
    public Food createCarbs() {
        int random = (int) (Math.random() * 2); // Number of available fat options
        switch (random) {
            case 0:
                return new Bread();
            case 1:
                return new Lentils();
            case 2:
                return new Pistachio();
            default:
                return null; // Handle error or return a default food
        }
    }
}
