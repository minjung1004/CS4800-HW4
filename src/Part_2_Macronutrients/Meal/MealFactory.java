package Part_2_Macronutrients.Meal;

import Part_2_Macronutrients.Carbs.Carbs;
import Part_2_Macronutrients.Carbs.NutAllergyCarbs;
import Part_2_Macronutrients.Carbs.PaleoCarbs;
import Part_2_Macronutrients.Carbs.VeganCarbs;
import Part_2_Macronutrients.Fats.Fats;
import Part_2_Macronutrients.Fats.NutAllergyFats;
import Part_2_Macronutrients.Fats.PaleoFats;
import Part_2_Macronutrients.Fats.VeganFats;
import Part_2_Macronutrients.Marconutrients.MacronutrientFactory;
import Part_2_Macronutrients.Protein.PaleoProtein;
import Part_2_Macronutrients.Protein.Protein;
import Part_2_Macronutrients.Protein.VeganProtein;


public class MealFactory implements MacronutrientFactory {
    private static MealFactory instance;
    private MealFactory(){}
    public static MealFactory getInstance() {
        if (instance == null) {
            instance = new MealFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbsFactory() {
        return Carbs.getInstance();
    }
    @Override
    public PaleoCarbs createPaleoCarbsFactory() {
        return PaleoCarbs.getInstance();
    }
    @Override
    public VeganCarbs createVeganCarbsFactory() {
        return VeganCarbs.getInstance();
    }
    @Override
    public NutAllergyCarbs createNutAllergyCarbsFactory() {
        return NutAllergyCarbs.getInstance();
    }

    @Override
    public Protein createProteinFactory() {
        return Protein.getInstance();
    }
    @Override
    public PaleoProtein createPaleoProteinFactory() {
        return PaleoProtein.getInstance();
    }
    @Override
    public VeganProtein createVeganProteinFactory() {
        return VeganProtein.getInstance();
    }

    @Override
    public Fats createFatsFactory() {
        return Fats.getInstance();
    }
    @Override
    public PaleoFats createPaleoFatsFactory() {
        return PaleoFats.getInstance();
    }
    @Override
    public VeganFats createVeganFatsFactory() {
        return VeganFats.getInstance();
    }
    @Override
    public NutAllergyFats createNutAllergyFatsFactory() {
        return NutAllergyFats.getInstance();
    }
}
