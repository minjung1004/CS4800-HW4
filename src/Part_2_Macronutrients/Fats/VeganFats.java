package Part_2_Macronutrients.Fats;

import Part_2_Macronutrients.FoodOptions.*;

public class VeganFats implements FatsFactory{
    private static VeganFats instance;
    private VeganFats() {}

    public static VeganFats getInstance() {
        if (instance == null ) {
            instance = new VeganFats();
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
                return new Tuna();
            case 2:
                return new Peanuts();
            default:
                return null;
        }
    }
}
