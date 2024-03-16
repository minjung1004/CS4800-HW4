package Part_2_Macronutrients.Fats;

import Part_2_Macronutrients.FoodOptions.*;

public class PaleoFats  implements FatsFactory{
    private static PaleoFats instance;

    public static PaleoFats getInstance() {
        if (instance == null) {
            instance = new PaleoFats();
        }
        return instance;
    }

    // default
    @Override
    public Food createFats() {
        int random = (int) (Math.random() * 2); // Number of available fat options
        switch (random) {
            case 0:
                return new Avocado();
            case 1:
                return new Tuna();
            case 2:
                return new Peanuts();
            default:
                return null; // Handle error or return a default food
        }
    }
}
