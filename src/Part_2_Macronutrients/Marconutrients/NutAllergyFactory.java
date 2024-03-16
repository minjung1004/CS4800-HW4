package Part_2_Macronutrients.Marconutrients;

import Part_2_Macronutrients.Carbs.Carbs;
import Part_2_Macronutrients.Carbs.CarbsFactory;
import Part_2_Macronutrients.Carbs.PaleoCarbs;
import Part_2_Macronutrients.Carbs.VeganCarbs;
import Part_2_Macronutrients.Carbs.NutAllergyCarbs;
import Part_2_Macronutrients.Fats.Fats;
import Part_2_Macronutrients.Fats.PaleoFats;
import Part_2_Macronutrients.Fats.VeganFats;
import Part_2_Macronutrients.Fats.NutAllergyFats;
import Part_2_Macronutrients.FoodOptions.*;
import Part_2_Macronutrients.Protein.PaleoProtein;
import Part_2_Macronutrients.Protein.VeganProtein;
import Part_2_Macronutrients.Protein.Protein;

public class NutAllergyFactory implements MacronutrientFactory{
    @Override
    public Carbs createCarbsFactory() {
        return null;
    }

    @Override
    public PaleoCarbs createPaleoCarbsFactory() {
        return null;
    }

    @Override
    public VeganCarbs createVeganCarbsFactory() {
        return null;
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
        return null;
    }

    @Override
    public VeganProtein createVeganProteinFactory() {
        return null;
    }


    @Override
    public Fats createFatsFactory() {
        return null;
    }

    @Override
    public PaleoFats createPaleoFatsFactory() {
        return null;
    }

    @Override
    public VeganFats createVeganFatsFactory() {
        return null;
    }

    @Override
    public NutAllergyFats createNutAllergyFatsFactory() {
        return NutAllergyFats.getInstance();
    }
}
