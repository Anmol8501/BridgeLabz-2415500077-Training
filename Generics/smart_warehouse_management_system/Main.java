package smart_warehouse_management_system;

import java.util.*;

public class Main {
	public static void displayAll(List<? extends WarehouseItem> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("TV"));
        electronics.addItem(new Electronics("Laptop"));
        displayAll(electronics.getItems());
    }
}