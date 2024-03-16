package Part_2_Macronutrients;

import Part_2_Macronutrients.Carbs.CarbsFactory;
import Part_2_Macronutrients.Fats.FatsFactory;
import Part_2_Macronutrients.FoodOptions.Food;
import Part_2_Macronutrients.Meal.Meal;
import Part_2_Macronutrients.Meal.MealFactory;
import Part_2_Macronutrients.Protein.ProteinFactory;

public class Driver {
    public static void main(String[] args) {


        Customer[] customers = {
                new Customer("Bob", "No Restriction"),
                new Customer("Sam", "Paleo"),
                new Customer("Elsa", "Vegan"),
                new Customer("Dom", "Nut Allergy"),
                new Customer("Jane", "Paleo"),
                new Customer("Jon", "Vegan")
        };

        for (Customer customer : customers) {
            if (customer.getDietPlan().equals("No Restriction")){
                MealFactory mealFactory = MealFactory.getInstance();
                CarbsFactory carbsFactory = mealFactory.createCarbsFactory();
                FatsFactory fatsFactory = mealFactory.createFatsFactory();
                ProteinFactory proteinFactory = mealFactory.createProteinFactory();

                Food carbs = carbsFactory.createCarbs();
                Food fats = fatsFactory.createFats();
                Food protein = proteinFactory.createProtein();

                Meal meal = new Meal(carbs, fats, protein);
                System.out.println("Customer Name: " + customer.getCustomerName() + "\nDiet Plan: " + customer.getDietPlan());
                meal.display();
            }else if (customer.getDietPlan().equals("Paleo")){
                MealFactory mealFactory = MealFactory.getInstance();
                CarbsFactory carbsFactory = mealFactory.createPaleoCarbsFactory();
                FatsFactory fatsFactory = mealFactory.createPaleoFatsFactory();
                ProteinFactory proteinFactory = mealFactory.createPaleoProteinFactory();

                Food paleoCarbs = carbsFactory.createCarbs();
                Food paleoFats = fatsFactory.createFats();
                Food paleoProtein = proteinFactory.createProtein();

                Meal meal = new Meal(paleoCarbs, paleoFats, paleoProtein);
                System.out.println("Customer Name: " + customer.getCustomerName() + "\nDiet Plan: " + customer.getDietPlan());
                meal.display();
            }else if (customer.getDietPlan().equals("Vegan")){
                MealFactory mealFactory = MealFactory.getInstance();
                CarbsFactory carbsFactory = mealFactory.createVeganCarbsFactory();
                FatsFactory fatsFactory = mealFactory.createVeganFatsFactory();
                ProteinFactory proteinFactory = mealFactory.createVeganProteinFactory();

                Food veganCarbs = carbsFactory.createCarbs();
                Food veganFats = fatsFactory.createFats();
                Food veganProtein = proteinFactory.createProtein();

                Meal meal = new Meal(veganCarbs, veganFats, veganProtein);
                System.out.println("Customer Name: " + customer.getCustomerName() + "\nDiet Plan: " + customer.getDietPlan());
                meal.display();
            } else if (customer.getDietPlan().equals("Nut Allergy")){
                MealFactory mealFactory = MealFactory.getInstance();
                CarbsFactory carbsFactory = mealFactory.createNutAllergyCarbsFactory();
                FatsFactory fatsFactory = mealFactory.createNutAllergyFatsFactory();
                ProteinFactory proteinFactory = mealFactory.createVeganProteinFactory();

                Food nutCarbs = carbsFactory.createCarbs();
                Food nutFats = fatsFactory.createFats();
                Food nutProtein = proteinFactory.createProtein();

                Meal meal = new Meal(nutCarbs, nutFats, nutProtein);
                System.out.println("Customer Name: " + customer.getCustomerName() + "\nDiet Plan: " + customer.getDietPlan());
                meal.display();
            }


//
        }
    }
}
