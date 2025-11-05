import java.util.*;

class Product { double price; Product(double p){ price=p; } double getPrice(){ return price; } }
class Mobile extends Product { Mobile(double p){ super(p); } }
class Laptop extends Product { Laptop(double p){ super(p); } }

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items){
        double total = 0;
        for(Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args){
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(15000));
        List<Laptop> laptops = Arrays.asList(new Laptop(40000), new Laptop(60000));
        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}
