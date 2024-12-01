import java.util.Scanner;

class Product {
    String productName;
    String category;
    int price;

    void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name");
        productName = sc.nextLine();
        System.out.println("Enter category");
        category = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextInt();
    }

    void printData() {
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        System.out.println("Enter details of product 1");
        p1.addData();
        System.out.println("Details of product 1");
        p1.printData();
        System.out.println("Enter details of product 2");
        p2.addData();
        System.out.println("Details of product 2");
        p2.printData();
    }
}
