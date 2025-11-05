class Product<T> {
    String name; double price;
    Product(String name, double price){ this.name=name; this.price=price; }
    public String toString(){ return name + " - ₹" + price; }
}

public class OnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        System.out.println("Applying " + percent + "% discount on " + product);
    }

    public static void main(String[] args) {
        Product<String> book = new Product<>("Book", 500);
        Product<String> gadget = new Product<>("Gadget", 1500);
        applyDiscount(book, 10);
        applyDiscount(gadget, 20);
    }
}
