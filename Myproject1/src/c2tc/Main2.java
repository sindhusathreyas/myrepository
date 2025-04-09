package c2tc;
import java.util.Scanner;

class Circle {
    // Data Members
    double radius;
    String color;

    // Method to accept input
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Color of Circle: ");
        color = sc.nextLine();
        sc.close(); // Close scanner to prevent resource leaks
    }

    // Method to calculate and display area
    void calcArea() {
        Double area = Math.PI * radius * radius;
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating an object of Circle
        Circle c = new Circle();

        // Calling methods
        c.getInput();
        c.calcArea();
    }
}

