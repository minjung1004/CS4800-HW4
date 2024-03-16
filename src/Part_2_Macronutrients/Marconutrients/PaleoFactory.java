package Part_2_Macronutrients.Marconutrients;

import Part_2_Macronutrients.Carbs.Carbs;
import Part_2_Macronutrients.Carbs.PaleoCarbs;
import Part_2_Macronutrients.Carbs.VeganCarbs;
import Part_2_Macronutrients.Carbs.NutAllergyCarbs;
import Part_2_Macronutrients.Fats.Fats;
import Part_2_Macronutrients.Fats.VeganFats;
import Part_2_Macronutrients.Fats.NutAllergyFats;
import Part_2_Macronutrients.Fats.PaleoFats;
import Part_2_Macronutrients.Protein.PaleoProtein;
import Part_2_Macronutrients.Protein.Protein;
import Part_2_Macronutrients.Protein.VeganProtein;

public class PaleoFactory implements MacronutrientFactory{
    @Override
    public Carbs createCarbsFactory() {
        return null;
    }

    @Override
    public PaleoCarbs createPaleoCarbsFactory() {
        return PaleoCarbs.getInstance();
    }

    @Override
    public VeganCarbs createVeganCarbsFactory() {
        return null;
    }

    @Override
    public NutAllergyCarbs createNutAllergyCarbsFactory() {
        return null;
    }

    @Override
    public Protein createProteinFactory() {
        return null;
    }

    @Override
    public PaleoProtein createPaleoProteinFactory() {
        return PaleoProtein.getInstance();
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
        return PaleoFats.getInstance();
    }

    @Override
    public VeganFats createVeganFatsFactory() {
        return null;
    }

    @Override
    public NutAllergyFats createNutAllergyFatsFactory() {
        return null;
    }
}
