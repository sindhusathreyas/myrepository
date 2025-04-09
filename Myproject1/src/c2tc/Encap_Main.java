package c2tc;
import java.util.Scanner;

// Encapsulation class
class Encapsulation {
    private int serialNum;
    private String name;
    private int age;

    // Getters and Setters
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Serial Number: " + serialNum + ", Name: " + name + ", Age: " + age;
    }
}

public class Encap_Main {
    public static void main(String[] args) {
        // Object creation
        Encapsulation obj = new Encapsulation();  // Use correct class name
        obj.setSerialNum(101);
        obj.setName("Bunny");
        obj.setAge(15);
        System.out.println(obj);
    }
}
