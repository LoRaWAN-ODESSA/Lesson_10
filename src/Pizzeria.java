/**
 * Main method fo Task 2
 */
public class Pizzeria {

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setOrder("Pepperoni", "BBQ", "Vegan", "My own");
        order1.setPizzaList();
        order1.printOrderInfo();

        Order order2 = new Order();
        order2.setOrder("BBQ", "BBQ", "Pepperoni", "Vegan", "Cheese", "Cheese", "My own");
        order2.setPizzaList();
        order2.printOrderInfo();
    }
}
