/**
 * This class is describing circle parameters;
 * @radius - radius;
 * @circumference - circumference;
 * @area - area;
 * @colour - colour;
 */
public class Circle {
    private double radius;
    private double circumference;
    private double area;
    private String color;

    public Circle() {
        //EMPTY
    }

    public Circle(double radius) {
        this.radius = radius;
        getArea();
        getCircumference();
        getRadius();
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * This method is returning radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        circumference = Math.round(2 * Math.PI * radius);
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        area = Math.round(Math.PI * Math.pow(radius, 2.0));
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    /**
     * This method is setting colour of the circle
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method is printing circle parameters
     */
    public void printInfo() {
        System.out.println("\nThe area of the circle is: " + getArea());
        System.out.println("The circumference of the circle is: " + getCircumference());
        System.out.println("The color of the circle is: " + getColor());
    }
}
