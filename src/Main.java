/**
 * This class is describing results of Task 1 my homework;
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        Circle circle1 = new Circle(10.1);
        circle1.setColor("Green");
        circle1.printInfo();

        Circle circle2 = new Circle(54, "Blue");
        circle2.printInfo();

        Circle circle3 = new Circle();
        circle3.setColor("Black");
        circle3.setRadius(456.87);
        circle3.printInfo();
    }
}