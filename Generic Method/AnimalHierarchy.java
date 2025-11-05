import java.util.*;

class Animal { String name; Animal(String n){ name=n; } }
class Dog extends Animal { Dog(){ super("Dog"); } }
class Cat extends Animal { Cat(){ super("Cat"); } }

public class AnimalHierarchy {
    public static void printAnimals(List<? extends Animal> animals){
        for(Animal a: animals) System.out.println(a.name);
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}
