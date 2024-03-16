package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;

// Singleton implementation of ProteinFactory
public class Protein implements ProteinFactory {
    private static Protein instance;

    private Protein() {}

    public static Protein getInstance() {
        if (instance == null) {
            instance = new Protein();
        }
        return instance;
    }

    @Override
    public Food createProtein() {
        //return null;
        // return a randoly protein food itme
        int random = (int) (Math.random() * 2); // Number of available fat options
        switch (random) {
            case 0:
                return new Fish();
            case 1:
                return new Chicken();
            case 2:
                return new Beef();
            case 3:
                return new Tofu();
            default:
                return null; // Handle error or return a default food
        }
    }
}
