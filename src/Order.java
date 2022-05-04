/**
 * This class is describing all order parameters
 * @numPizza - number of pizzas in order;
 * @names - list of pizzas names in order;
 * @prices - list of pizzas prices in order;
 * @compositions - list of pizzas compositions in order;
 * @diameters - list of pizzas diameters in order;
 * @totalCost - total cost in order;
 * @pizzaList - list of pizzas parameters in order;
 */
public class Order extends Pizza{

    private int numPizza;
    private String[] names;
    private double[] prices;
    private String[] compositions;
    private double[] diameters;

    private double totalCost;

    private Pizza[] pizzaList;

    public Order() {
        //EMPTY
    }

    public int getNumPizza() {
        return numPizza;
    }

    public void setNumPizza(int numPizza) {
        this.numPizza = numPizza;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public String[] getCompositions() {
        return compositions;
    }

    public void setCompositions(String[] compositions) {
        this.compositions = compositions;
    }

    public double[] getDiameters() {
        return diameters;
    }

    public void setDiameters(double[] diameters) {
        this.diameters = diameters;
    }

    /**
     * This method sets all pizzas parameters in order
     * @param names names of pizzas, wich client has ordered
     */
    public void setOrder(String... names) {
        int sum = 0;
        for(String pizzaName: names){
            sum += 1;
        }
        numPizza = sum;
        this.names = new String[numPizza];
        sum = 0;
        for(String pizzaName: names) {
            this.names[sum] = pizzaName;
            sum += 1;
        }
        this.prices = setPriceList();
        this.compositions = setCompositionList();
        this.diameters = setDiametersList();
        setTotalCost();
    }

    private double[] setPriceList() {
        this.prices = new double[numPizza];
        for (int i = 0; i < numPizza; i++) {
            switch (names[i]){
                case "Cheese":
                    prices[i] = 150.00;
                    break;
                case "Pepperoni":
                    prices[i] = 230.50;
                    break;
                case "Vegan":
                    prices[i] = 311.50;
                    break;
                case "BBQ":
                    prices[i] = 350.00;
                    break;
                default:
                    prices[i] = 500.00;

            }
        }
        return prices;
    }

    private String[] setCompositionList() {
        this.compositions = new String[numPizza];
        for (int i = 0; i < numPizza; i++) {
            switch (names[i]){
                case "Cheese":
                    compositions[i] = "Cheese, potatoes, sauces, parmesan";
                    break;
                case "Pepperoni":
                    compositions[i] = "Pepperoni, potatoes, sauces, mozzarella, pepper";
                    break;
                case "Vegan":
                    compositions[i] = "Cheese, potatoes, sauces, parmesan, mozzarella";
                    break;
                case "BBQ":
                    compositions[i] = "BBQ, Pepperoni, potatoes, sauces, mozzarella, pepper";
                    break;
                default:
                    compositions[i] = "You have chosen your personal ingredients";

            }
        }
        return compositions;
    }

    private double[] setDiametersList() {
        this.diameters = new double[numPizza];
        for (int i = 0; i < numPizza; i++) {
            switch (names[i]){
                case "Cheese":
                    diameters[i] = 30.0;
                    break;
                case "Pepperoni":
                    diameters[i] = 50.0;
                    break;
                case "Vegan":
                    diameters[i] = 40.0;
                    break;
                case "BBQ":
                    diameters[i] = 45.0;
                    break;
                default:
                    diameters[i] = 50.00;

            }
        }
        return diameters;
    }

    public double getTotalCost() {
        return totalCost;
    }

    private void setTotalCost() {
        for (int i = 0; i < prices.length; i++) {
            this.totalCost += prices[i];
        }
    }

    public Pizza[] getPizzaList() {
        return pizzaList;
    }

    /**
     * This method creates list of pizzas in order
     */
    public void setPizzaList() {
        this.pizzaList = new Pizza[numPizza];
        for (int i = 0; i < numPizza; i++) {
            Pizza pizza = new Pizza(getNames()[i], getCompositions()[i], getPrices()[i], getDiameters()[i]);
            this.pizzaList[i] = pizza;
        }
    }

    /**
     * This method prints order information
     */
    public void printOrderInfo() {
        System.out.println("You have ordered " + numPizza + " pizzas");
        for (int i = 0; i < numPizza; i++) {
            System.out.println((i + 1) + " " + getNames()[i] + "; Compositions: " + getCompositions()[i] +
                    "; Price: " + getPrices()[i] + "; Diameter: " + getDiameters()[i] +
                    "    [radius: " + pizzaList[i].getBasis().getRadius() + "; Circumference: " + pizzaList[i].getBasis().getCircumference() +
                    "; Area: " + pizzaList[i].getBasis().getArea() + "]");
        }
        System.out.println("Total cost: " + getTotalCost());
    }
}
