package Part_2_Macronutrients.Fats;

import Part_2_Macronutrients.FoodOptions.*;

public class NutAllergyFats implements FatsFactory{
    private static NutAllergyFats instance;
    private NutAllergyFats() {}
    public static NutAllergyFats getInstance() {
        if (instance == null ) {
            instance = new NutAllergyFats();
        }
        return instance;
    }
    @Override
    public Food createFats() {
        int random = (int) (Math.random() * 2);
        switch (random) {
            case 0:
                return new Avocado();
            case 1:
                return new SourCream();
            case 2:
                return new Tuna();
            default:
                return null;
        }
    }
}
