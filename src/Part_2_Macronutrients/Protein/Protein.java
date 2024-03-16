package Part_2_Macronutrients.Protein;

import Part_2_Macronutrients.FoodOptions.*;

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
        int random = (int) (Math.random() * 2);
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
                return null;
        }
    }
}
