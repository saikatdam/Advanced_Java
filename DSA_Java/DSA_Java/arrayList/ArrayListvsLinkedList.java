import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements at the beginning
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (add at the beginning): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (add at the beginning): " + (endTime - startTime) + " ns");

        // Accessing elements in the middle
        int middleIndex = linkedList.size() / 2;
        startTime = System.nanoTime();
        linkedList.get(middleIndex);
        endTime = System.nanoTime();
        System.out.println("LinkedList (access in the middle): " + (endTime - startTime) + " ns");

        middleIndex = arrayList.size() / 2;
        startTime = System.nanoTime();
        arrayList.get(middleIndex);
        endTime = System.nanoTime();
        System.out.println("ArrayList (access in the middle): " + (endTime - startTime) + " ns");
    }
}