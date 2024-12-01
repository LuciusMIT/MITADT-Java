import java.util.Scanner;

class Laptop {
    String brand;
    String model;
    int price;

    void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand");
        brand = sc.nextLine();
        System.out.println("Enter model");
        model = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextInt();
    }

    void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        System.out.println("Enter details of laptop 1");
        l1.addData();
        System.out.println("Details of laptop 1");
        l1.printData();
        System.out.println("Enter details of laptop 2");
        l2.addData();
        System.out.println("Details of laptop 2");
        l2.printData();
    }
}
