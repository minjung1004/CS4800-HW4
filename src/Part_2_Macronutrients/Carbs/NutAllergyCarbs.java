package Part_2_Macronutrients.Carbs;

import Part_2_Macronutrients.FoodOptions.*;

public class NutAllergyCarbs implements CarbsFactory{
    private static NutAllergyCarbs instance;

    private NutAllergyCarbs() {}

    public static NutAllergyCarbs getInstance() {
        if (instance == null) {
            instance = new NutAllergyCarbs();
        }
        return instance;
    }

    @Override
    public Food createCarbs() {
        int random = (int) (Math.random() * 2);
        switch (random) {
            case 0:
                return new Cheese();
            case 1:
                return new Bread();
            case 2:
                return new Lentils();
            default:
                return null;
        }
    }
}
