package animal_hierarchy;

import java.util.*;

class Animal {
    public void speak() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    public void speak() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    public void speak() { System.out.println("Meow!"); }
}

class Main {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) a.speak();
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}