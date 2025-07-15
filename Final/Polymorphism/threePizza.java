import java.util.Scanner;

class Pizza {
    private String size;
    private int nct;
    private int npt;
    private int nhm;

    Pizza(String size, int nct, int npt, int nhm) {
        this.size = size;
        this.nct = nct;
        this.npt = npt;
        this.nhm = nhm;
    }
    void setSize(String size) {
        this.size = size;
    }
    String getSize() {
        return size;
    }
    void setNCT(int nct) {
        this.nct = nct;
    }
    int getNCT() {
        return nct;
    }
    void setNPT(int npt) {
        this.npt = npt;
    }
    int getNPT() {
        return npt;
    }
    void setNHM(int nhm) {
        this.nhm = nhm;
    }
    int getNHM() {
        return nhm;
    }

    double calcCost() {
        double cost = 0;
        switch (size) {
            case "small":
                cost += 10;
                break;
            case "medium":
                cost += 12;
                break;
            case "large":
                cost += 14;
                break;
            default:
                System.out.println("Wrong input!");
        }
        cost += (nct*2) + (npt*2) + (nhm*2);
        return cost;
    }
    String getDescription() {
        return "Pizza size: " + size + "\nNCT: " + nct + "\nNPT: " + npt + "\nNHM: " + nhm ;
    }
    
}
class pizzaOrder {
    double cost = 0;
    Pizza[] pizzas;

    pizzaOrder(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    double calcTotal() {
        for (Pizza pizza : pizzas) {
            cost += pizza.calcCost();
        }
        return cost;
    }
}

public class threePizza {
    public static void main(String[] args) {
        // Pizza pizza = new Pizza("large", 1, 1, 2);
        // System.out.println(pizza.getDescription());
        // System.out.println(pizza.calcCost());

        Scanner sc = new Scanner(System.in);

        System.out.print("Input pizza number (1-3): ");
        int n = sc.nextInt();
        Pizza[] pizzas = new Pizza[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Input size (small/medium/large): ");
            String size = sc.nextLine();
            size = sc.nextLine();
            System.out.print("Input NCT: ");
            int nct = sc.nextInt();
            System.out.print("Input NPT: ");
            int npt = sc.nextInt();
            System.out.print("Input NHM: ");
            int nhm = sc.nextInt();

            pizzas[i] = new Pizza(size, nct, npt, nhm);

            // pizzas[i].setSize(size);
            // pizzas[i].setNCT(nct);
            // pizzas[i].setNPT(npt);
            // pizzas[i].setNHM(nhm);
        }

        pizzaOrder pizzaorder = new pizzaOrder(pizzas);
        System.out.println("Total cost: " + pizzaorder.calcTotal());
        
        sc.close();
    }
}
