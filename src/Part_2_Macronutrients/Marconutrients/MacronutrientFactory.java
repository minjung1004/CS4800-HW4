package Part_2_Macronutrients.Marconutrients;

import Part_2_Macronutrients.Carbs.Carbs;
import Part_2_Macronutrients.Carbs.PaleoCarbs;
import Part_2_Macronutrients.Carbs.VeganCarbs;
import Part_2_Macronutrients.Carbs.NutAllergyCarbs;
import Part_2_Macronutrients.Fats.Fats;
import Part_2_Macronutrients.Fats.VeganFats;
import Part_2_Macronutrients.Fats.PaleoFats;
import Part_2_Macronutrients.Fats.NutAllergyFats;
import Part_2_Macronutrients.Protein.PaleoProtein;
import Part_2_Macronutrients.Protein.Protein;
import Part_2_Macronutrients.Protein.VeganProtein;

public interface MacronutrientFactory {
    Carbs createCarbsFactory();
    PaleoCarbs createPaleoCarbsFactory();
    VeganCarbs createVeganCarbsFactory();
    NutAllergyCarbs createNutAllergyCarbsFactory();

    Protein createProteinFactory();
    PaleoProtein createPaleoProteinFactory();
    VeganProtein createVeganProteinFactory();


    Fats createFatsFactory();
    PaleoFats createPaleoFatsFactory();
    VeganFats createVeganFatsFactory();
    NutAllergyFats  createNutAllergyFatsFactory();
}

