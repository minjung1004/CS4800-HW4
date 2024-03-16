package Part_2_Macronutrients.Meal;

import Part_2_Macronutrients.FoodOptions.Food;

public class Meal {
    private Food carbs;
    private Food fats;
    private Food protein;

    public Meal (Food carbs, Food fats, Food protein) {
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
    }

    public void display(){
        System.out.println("Meal:\nCarbs: " +
                carbs.getName() + "\nFats: " +
                fats.getName() + "\nProtein: " +
                protein.getName() + "\n");
    }

}
