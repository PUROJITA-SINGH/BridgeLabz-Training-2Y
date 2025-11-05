import java.util.*;

abstract class WarehouseItem { String name; WarehouseItem(String n){ name=n; } public String toString(){return name;} }
class Electronics extends WarehouseItem { Electronics(){ super("Electronics"); } }
class Groceries extends WarehouseItem { Groceries(){ super("Groceries"); } }
class Furniture extends WarehouseItem { Furniture(){ super("Furniture"); } }

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void addItem(T item){ items.add(item); }
}

public class SmartWarehouse {
    public static void displayAll(List<? extends WarehouseItem> items){
        for(WarehouseItem i: items) System.out.println(i);
    }

    public static void main(String[] args){
        Storage<Electronics> eStore = new Storage<>();
        eStore.addItem(new Electronics());
        Storage<Groceries> gStore = new Storage<>();
        gStore.addItem(new Groceries());
        displayAll(eStore.items);
        displayAll(gStore.items);
    }
}
