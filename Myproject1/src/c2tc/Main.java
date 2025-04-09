package c2tc;
import java.util.Scanner;

class Student {
    // Default Constructor
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    // Data Members
    String name, address, phone;
    double salesAmount, commission;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        sc.close(); // Closing scanner to prevent resource leak
    }

    // Method to calculate commission
    void calculateCommission() {
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000 && salesAmount < 100000) { // Corrected condition
            commission = salesAmount * 0.05;
        } else if (salesAmount > 30000 && salesAmount < 50000) { // Corrected condition
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Earned: " + commission);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating Student object
        Student s = new Student();

        // Creating Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
        emp.displayDetails();
    }
}


