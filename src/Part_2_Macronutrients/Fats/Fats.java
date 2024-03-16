package Part_2_Macronutrients.Fats;

import Part_2_Macronutrients.FoodOptions.*;


public class Fats implements FatsFactory {
    private static Fats instance;
    private Fats() {}

    public static Fats getInstance() {
        if (instance == null ) {
            instance = new Fats();
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
            case 3:
                return new Peanuts();
            default:
                return null;
        }
    }
}
