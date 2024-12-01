class Product {
    int price;
    String brand;

    public Product(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int calculateDiscount(int discountPercentage) {
        return (price * discountPercentage) / 100;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Price: $" + price);
    }
}

class Electronics extends Product {
    int warranty;

    public Electronics(int price, String brand, int warranty) {
        super(price, brand);
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warranty + " months");
    }

    public void processOrder() {
        System.out.println("Processing order for electronics...");
    }
}

class Clothing extends Product {
    String size;

    public Clothing(int price, String brand, String size) {
        super(price, brand);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
    }

    public void processOrder() {
        System.out.println("Processing order for clothing...");
    }
}

class Food extends Product {
    String expiryDate;

    public Food(int price, String brand, String expiryDate) {
        super(price, brand);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }

    public void processOrder() {
        System.out.println("Processing order for food...");
    }
}

class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(1000, "Dell", 24);
        Clothing tShirt = new Clothing(20, "Nike", "M");
        Food apple = new Food(2, "FreshFarms", "2024-12-15");

        laptop.displayDetails();
        System.out.println("Discount: $" + laptop.calculateDiscount(10));
        laptop.processOrder();
        
        tShirt.displayDetails();
        System.out.println("Discount: $" + tShirt.calculateDiscount(15));
        tShirt.processOrder();
        
        apple.displayDetails();
        System.out.println("Discount: $" + apple.calculateDiscount(5));
        apple.processOrder();
    }
}
