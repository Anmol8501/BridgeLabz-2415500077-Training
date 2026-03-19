package Singly_Linked_List_Inventory_Management_System;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n----- Inventory -----");
        InventoryList inventory = new InventoryList();
        inventory.addFirst("Laptop", 101, 5, 60000);
        inventory.addLast("Mouse", 102, 20, 500);
        inventory.addAtPosition(0, "Keyboard", 103, 10, 1000);
        inventory.remove(101);
        inventory.update(102, 25);
        inventory.search(103, "Keyboard");
        inventory.sortAscending();
        inventory.sortDescending();
        System.out.println("Total Value = " + inventory.totalValue());
    }
}
