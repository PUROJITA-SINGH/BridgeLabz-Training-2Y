import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " - ₹" + price + " - Rating: " + rating + " - Discount: " + discount + "%";
    }
}

public class ProductSortLambda {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2500, 4.2, 10),
            new Product("Watch", 1800, 4.8, 15),
            new Product("Bag", 1200, 4.0, 5)
        );

        System.out.println("Sort by Price:");
        products.stream().sorted((a, b) -> Double.compare(a.price, b.price)).forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.stream().sorted((a, b) -> Double.compare(b.rating, a.rating)).forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.stream().sorted((a, b) -> Double.compare(b.discount, a.discount)).forEach(System.out::println);
    }
}
