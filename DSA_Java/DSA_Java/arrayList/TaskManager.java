import java.util.LinkedList;
import java.util.Scanner;

class Task {
    String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        LinkedList<Task> taskList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String taskDescription = scanner.nextLine();
                    Task newTask = new Task(taskDescription);
                    taskList.add(newTask);
                    System.out.println("Task added: " + newTask);
                    break;
                case 2:
                    System.out.println("Task List:");
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Task Manager.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
