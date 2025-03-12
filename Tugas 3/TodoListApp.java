import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    //shabrina
    private ArrayList<String> todoList;

    // Constructor to initialize the ArrayList
    public TodoListApp() {
        todoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        todoList.add(task);
    }

    // Method to remove a task by name
    public void removeTask(String task) {
        if (todoList.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Method to remove a task by index
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // Method to search for a task by name
    public void searchTask(String task) {
        if (todoList.contains(task)) {
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("Your todo List");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
    }

    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By Task Name");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTask(taskToRemove);
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    app.removeTaskByIndex(indexToRemove);
                    break;

                case 4:
                    System.out.print("Enter task to search: ");
                    String taskToSearch = scanner.nextLine();
                    app.searchTask(taskToSearch);
                    break;

                case 5:
                    app.displayTasks();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}