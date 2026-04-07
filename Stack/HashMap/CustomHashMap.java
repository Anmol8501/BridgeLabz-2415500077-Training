package Stack.HashMap;

public class CustomHashMap {
 
    static int SIZE = 10;
 
    static class Node {
        String key;
        int value;
        Node next;
 
        Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
 
    Node[] table = new Node[SIZE];
 
    int getIndex(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % SIZE;
    }
 
    void insert(String key, int value) {
        int index = getIndex(key);
 
        if (table[index] == null) {
            table[index] = new Node(key, value);
        } else {
            Node temp = table[index];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = table[index];
            table[index] = newNode;
        }
    }
 
    int get(String key) {
        int index = getIndex(key);
        Node temp = table[index];
 
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
 
        return -1;
    }
 
    void delete(String key) {
        int index = getIndex(key);
        Node temp = table[index];
        Node prev = null;
 
        while (temp != null) {
            if (temp.key.equals(key)) {
                if (prev == null) {
                    table[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                System.out.println(key + " deleted.");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
 
        System.out.println(key + " not found.");
    }
 
    void display() {
        System.out.println("HashMap contents:");
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                System.out.print("Index " + i + ": ");
                Node temp = table[i];
                while (temp != null) {
                    System.out.print("(" + temp.key + ", " + temp.value + ")");
                    if (temp.next != null) {
                        System.out.print(" -> ");
                    }
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }
 
    public static void main(String[] args) {
 
        CustomHashMap map = new CustomHashMap();
 
        map.insert("apple", 10);
        map.insert("banana", 20);
        map.insert("cat", 30);
        map.insert("dog", 40);
        map.insert("egg", 50);
 
        map.display();
 
        System.out.println("\nget apple: " + map.get("apple"));
        System.out.println("get dog: " + map.get("dog"));
        System.out.println("get mango: " + map.get("mango"));
 
        System.out.println("\nUpdating apple to 99");
        map.insert("apple", 99);
        System.out.println("get apple after update: " + map.get("apple"));
 
        System.out.println();
        map.delete("banana");
        map.delete("mango");
 
        System.out.println();
        map.display();
    }
}