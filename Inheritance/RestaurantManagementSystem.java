public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", "C001");
        Waiter waiter = new Waiter("Bob", "W001");
        
        chef.displayDetails();
        chef.performDuties();
        waiter.displayDetails();
        waiter.performDuties();
    }
}

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected String id;
    
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking a meal.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, String id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
