package fruit_storage;

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();

    public void add(T fruit) { fruits.add(fruit); }
    public void display() { fruits.forEach(System.out::println); }

    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.display();

        // FruitBox<Car> invalidBox = new FruitBox<>(); // ❌ Compile-time error
    }
}
