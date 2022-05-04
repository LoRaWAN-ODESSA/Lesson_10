/**
 * This method is describing pizzas parameters
 */
public class Pizza {
    private Circle basis;
    private String composition;
    private String name;
    private double cost;


    public Pizza(String name, String composition, double cost, double diameter) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        Circle circle = new Circle(diameter / 2);
        basis = circle;
    }

    public Pizza() {
        //EMPTY
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPizzaList(Order order) {

    }
}
