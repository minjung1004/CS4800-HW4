package Part_1_Pizza;

public class Driver {
    public static void main(String[] args) {

        String[] pizzaToppings_1 = {"Pepperoni"};
        String[] pizzaToppings_2 = {"Sausage" ,"Peppers"};
        String[] pizzaToppings_3 = {"Pepperoni" , "Sausage" ,"Musrhroom"};
        String[] pizzaToppings_6 = {"Bacon" , "Onions" ,"Extra Cheese", "Peppers", " Chicken", "Olives"};
        String[] pizzaToppings_8 = {"Bacon", "Onions", "Mushrooms", "Ham", "Peppers", "Olives", "Spinach", " Extra Cheese"};
        String[] pizzaToppings_9 = {"Spinach" , "Tomato and Basil" ,"Beef", "Onions", "Pesto", "Spicy Pork", "Ham and Pineapple", "Bacon", "Peppers"};

        Pizza pizzaHut_1 = new PizzaBuilder("Pizza Hut")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_3)
                .build();


        Pizza pizzaHut_2 = new PizzaBuilder("Pizza Hut")
                .withPizzaSize("Medium")
                .withToppings(pizzaToppings_6)
                .build();

        Pizza pizzaHut_3 = new PizzaBuilder("Pizza Hut")
                .withPizzaSize("Large")
                .withToppings(pizzaToppings_9)
                .build();

        Pizza littleCaesar_1 = new PizzaBuilder("Little Caesar")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_3)
                .build();

        Pizza littleCaesar_2 = new PizzaBuilder("Little Caesar")
                .withPizzaSize("Medium")
                .withToppings(pizzaToppings_6)
                .build();

        Pizza littleCaesar_3 = new PizzaBuilder("Little Caesar")
                .withPizzaSize("Large")
                .withToppings(pizzaToppings_9)
                .build();

        Pizza dominos_1 = new PizzaBuilder("Dominos")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_3)
                .build();

        Pizza dominos_2 = new PizzaBuilder("Dominos")
                .withPizzaSize("Medium")
                .withToppings(pizzaToppings_6)
                .build();

        Pizza dominos_3 = new PizzaBuilder("Dominos")
                .withPizzaSize("Large")
                .withToppings(pizzaToppings_9)
                .build();

        Pizza pizzaHut_4 = new PizzaBuilder("Pizza Hut")
                .withPizzaSize("Large")
                .withToppings(pizzaToppings_3)
                .build();

        Pizza pizzaHut_5 = new PizzaBuilder("Pizza Hut")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_2)
                .build();

        Pizza littleCaesar_4 = new PizzaBuilder("Little Caesar")
                .withPizzaSize("Medium")
                .withToppings(pizzaToppings_8)
                .build();

        Pizza littleCaesar_5 = new PizzaBuilder("Little Caesar")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_6)
                .build();

        Pizza dominos_4 = new PizzaBuilder("Dominos")
                .withPizzaSize("Small")
                .withToppings(pizzaToppings_1)
                .build();

        Pizza dominos_5 = new PizzaBuilder("Dominos")
                .withPizzaSize("Large")
                .withToppings(pizzaToppings_3)
                .build();


        System.out.println("Pizza Hut Orders");
        pizzaHut_1.eat();
        pizzaHut_2.eat();
        pizzaHut_3.eat();

        System.out.println("\nLittle Caesars Orders");
        littleCaesar_1.eat();
        littleCaesar_2.eat();
        littleCaesar_3.eat();

        System.out.println("\nDominos Orders");
        dominos_1.eat();
        dominos_2.eat();
        dominos_3.eat();

        System.out.println("\nMixed Orders");
        pizzaHut_4.eat();
        pizzaHut_5.eat();
        littleCaesar_4.eat();
        littleCaesar_5.eat();
        dominos_4.eat();
        dominos_5.eat();
    }
}
