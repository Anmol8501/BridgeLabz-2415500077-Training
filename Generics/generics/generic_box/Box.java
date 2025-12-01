package generic_box;

class Box<T> {
	private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(99.99);
        System.out.println("Double: " + dblBox.get());
    }
}
