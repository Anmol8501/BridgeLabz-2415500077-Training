package generic_pair;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Name: " + student.getFirst() + ", Age: " + student.getSecond());
    }
}
