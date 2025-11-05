class Fruit { String name; Fruit(String n){ name=n; } public String toString(){return name;} }
class Apple extends Fruit { Apple(){ super("Apple"); } }
class Mango extends Fruit { Mango(){ super("Mango"); } }

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    public void add(T fruit){ fruits.add(fruit); }
    public void display(){ for(T f: fruits) System.out.println(f); }
}

public class FruitBoxDemo {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
}
