class Pizza {
    private String size;
    private int cheese, pepperoni, ham;
    Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }
    String getSize() {
        return size;
    }
    int getCheese() {
        return cheese;
    }
    int getPepperoni() {
        return pepperoni;
    }
    int getHam() {
        return ham;
    }
    void set(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }
    double cost() {
        int sum = 0;
        if (size == "small") {
            sum += 10;
        }
        else if (size == "medium") {
            sum += 12;
        }
        else if (size == "large") {
            sum += 14;
        }
        sum += (2 * (cheese + pepperoni + ham));
        return sum;
    }
    void getDescription() {
        System.out.println("Size: " + size);
        System.out.println("Cheese: " + cheese);
        System.out.println("Pepperoni: " + pepperoni);
        System.out.println("Ham: " + ham);
    }
}
// class PizzaOrder extends Pizza {
//     Pizza[] pizzas = new Pizza[3];
//     PizzaOrder() {
//         pizzas = new Pizza[3];
//     }
// }
public class n3 {

    public static void main(String[] args) {
        // PizzaOrder[] pizzaOrders = new PizzaOrder[3];
        Pizza[] pizza = new Pizza[3];

        Pizza pizza = new Pizza("medium", 1, 2, 1);
        pizza.getDescription();
        System.out.println("Total cost: " + pizza.cost());
    }
}