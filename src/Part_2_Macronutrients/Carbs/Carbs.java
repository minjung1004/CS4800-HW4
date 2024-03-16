package Part_2_Macronutrients.Carbs;

import Part_2_Macronutrients.FoodOptions.*;

// Singleton implementation of CarbsFactory
public class Carbs implements CarbsFactory {
    private static Carbs instance;

    private Carbs() {}

    public static Carbs getInstance() {
        if (instance == null) {
            instance = new Carbs();
        }
        return instance;
    }

    @Override
    public Food createCarbs() {
        int random = (int) (Math.random() * 2); // Number of available fat options
        switch (random) {
            case 0:
                return new Cheese();
            case 1:
                return new Bread();
            case 2:
                return new Lentils();
            case 3:
                return new Pistachio();
            default:
                return null; // Handle error or return a default food
        }
    }
}
