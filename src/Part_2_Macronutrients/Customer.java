package Part_2_Macronutrients;

public class Customer {
    private String customerName;
    private String dietPlan;

    public Customer(String customerName, String dietPlan) {
        this.customerName = customerName;
        this.dietPlan = dietPlan;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getDietPlan(){
        return dietPlan;
    }
}
