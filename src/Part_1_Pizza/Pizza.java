package Part_1_Pizza;
import java.util.List;
import java.util.ArrayList;

public class Pizza {
    private String pizzaChain;
    private String pizzaSize;
    private List<String> toppings;

    public Pizza(String pizzaChain) {
        this.pizzaChain = pizzaChain;
//        this.pizzaSize = pizzaSize;
        this.toppings = new ArrayList<>();
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setToppings(String topping){
        toppings.add(topping);
    }

    public void eat() {
        System.out.println(pizzaChain + "\nSize: " + pizzaSize + "\nToppings: " + toppings);
    }
}
