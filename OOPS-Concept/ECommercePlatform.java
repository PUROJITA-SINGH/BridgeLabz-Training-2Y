import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Electronics("P001", "Laptop", 1000, 10));
        products.add(new Clothing("P002", "Shirt", 50, "M"));
        products.add(new Groceries("P003", "Rice", 20, 5));
        
        for (Product product : products) {
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - product.calculateDiscount();
            System.out.println("Product: " + product.getName());
            System.out.printf("Final Price: $%.2f\n", finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }
}

abstract class Product {
    private String productId;
    private String name;
    private double price;
    
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountPercent;
    
    public Electronics(String productId, String name, double price, double discountPercent) {
        super(productId, name, price);
        this.discountPercent = discountPercent;
    }
    
    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercent / 100;
    }
    
    @Override
    public double calculateTax() {
        return getPrice() * 0.08; // 8% tax
    }
    
    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 8%";
    }
}

class Clothing extends Product {
    private String size;
    
    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }
    
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

class Groceries extends Product implements Taxable {
    private int quantity;
    
    public Groceries(String productId, String name, double price, int quantity) {
        super(productId, name, price);
        this.quantity = quantity;
    }
    
    @Override
    public double calculateDiscount() {
        return quantity > 3 ? getPrice() * 0.1 : 0; // 10% discount for >3 items
    }
    
    @Override
    public double calculateTax() {
        return 0; // No tax for groceries
    }
    
    @Override
    public String getTaxDetails() {
        return "Groceries Tax: 0%";
    }
}
