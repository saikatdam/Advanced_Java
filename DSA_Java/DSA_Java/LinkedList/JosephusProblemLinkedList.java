import java.util.LinkedList;

public class JosephusProblemLinkedList {
    public static void main(String[] args) {
        int numberOfPeople = 7; // Change this to the number of people in the circle.
        int eliminationStep = 3; // Change this to the step at which people are eliminated.

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= numberOfPeople; i++) {
            circle.add(i);
        }

        int survivorPosition = findSurvivorPosition(circle, eliminationStep);
        System.out.println("The last person standing is at position: " + survivorPosition);
    }

    public static int findSurvivorPosition(LinkedList<Integer> circle, int step) {
        if (circle.isEmpty() || step <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + step - 1) % circle.size();
            circle.remove(index);
        }

        return circle.get(0);
    }
}
