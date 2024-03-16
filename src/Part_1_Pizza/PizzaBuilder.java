package Part_1_Pizza;
public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(String pizzaChain) {
        this.pizza = new Pizza(pizzaChain);
    }

    public PizzaBuilder withPizzaSize(String pizzaSize) {
        pizza.setPizzaSize(pizzaSize);
        return this;
    }

    public PizzaBuilder withToppings(String[] toppings) {
        for(String topping : toppings) {
            pizza.setToppings(topping);
        }
        return this;
    }
    public Pizza build(){
        return pizza;
    }

}


