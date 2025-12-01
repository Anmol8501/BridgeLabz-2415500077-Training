package queue_interface;

public class CircularBufferSimulation {
	public static void main(String[] args) {

        int size = 3;
        int[] buffer = new int[size];
        int front = 0, rear = 0, count = 0;

        int[] input = {1, 2, 3, 4};

        for (int x : input) {
            buffer[rear] = x;
            rear = (rear + 1) % size;

            if (count < size) count++;
            else front = (front + 1) % size;
        }

        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++)
            System.out.print(buffer[(front + i) % size] + " ");
        System.out.println("]");
    }
}
