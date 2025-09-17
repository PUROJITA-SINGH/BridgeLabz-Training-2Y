import java.util.ArrayList;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("F001", "Salad", 10, 2));
        order.add(new NonVegItem("F002", "Chicken Curry", 15, 1));
        
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.printf("Total Price: $%.2f\n", item.calculateTotalPrice());
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount();
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }
    }
}

abstract class FoodItem implements Discountable {
    private String itemId; // Added itemId field
    private String itemName;
    private double price;
    private int quantity;
    
    public FoodItem(String itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { this.price = price; }
    
    public abstract double calculateTotalPrice();
    
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Item: " + itemName + ", Price: $" + String.format("%.2f", price) + 
               ", Quantity: " + quantity;
    }
}

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem {
    public VegItem(String itemId, String itemName, double price, int quantity) {
        super(itemId, itemName, price, quantity);
    }
    
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    
    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.9); // 10% discount
    }
    
    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemId, String itemName, double price, int quantity) {
        super(itemId, itemName, price, quantity);
    }
    
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 2; // $2 surcharge for non-veg
    }
    
    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.95); // 5% discount
    }
    
    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
