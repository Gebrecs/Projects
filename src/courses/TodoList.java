package courses;
import java.util.Scanner;
import java.util.ArrayList;
public class TodoList {
    // an ArrayList that stores tasks.
    private static final ArrayList<String> tasks= new ArrayList<>();
    //An ArrayList that stores the status of each task,or a boolean that indicates if the task is completed.
    private static final ArrayList<Boolean> isCompleted=new ArrayList<>();
     public void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        boolean isTrue=true;
        while(isTrue){

            // calling printMenu method
            printMenu();
            int choice=scanner.nextInt();
            scanner.nextLine();// consumes new lines or an enter key

            switch (choice){
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskCompleted(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                case 5:
                    // if the user enters 5 isTrue is now false, so the loop terminates
                    isTrue=false;
                    System.out.println("Exiting, thank 🥹🥹🥹 you for using our application");
                    break;
                default:
                    System.out.println("Oh sorry 🙏🙏🙏, invalid choice");
            }

        }
        scanner.close();
    }
    // a task menu that has five choices
    private static void printMenu(){
        System.out.println("\n 📋📋📋 TodoList Application:🈸🈸🈸");
        System.out.println("1. add a task");
        System.out.println("2. view all tasks");
        System.out.println("3.Mark a task as completed");
        System.out.println("4. remove a task");
        System.out.println("5.exit");
        System.out.println("Enter your choice:");
    }
    private static void addTask(Scanner scanner){
        System.out.println("Enter a task 💪💪💪: ");
        String task = scanner.nextLine(); // accepts a task from a user
        // adding task to the ArrayList
        tasks.add(task);
        // adding a boolean value to the ArrayList
        isCompleted.add(false);
        System.out.println("The task has been successfully added ");

    }
    private static void viewTasks(){
        System.out.println("\nTo-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            // get method returns the value at the specified index
            // if the task is completed or done,status is completed
            String status = isCompleted.get(i) ? "Completed" : "Pending";
            System.out.println((i + 1) + ". " + tasks.get(i) + " [" + status + "]");
        }
    }

    private static void markTaskCompleted(Scanner scanner){
        System.out.println("enter the task number to mark as completed");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if(taskNumber>0&&taskNumber<=tasks.size()){
            isCompleted.set(taskNumber-1,true);
            System.out.println("Task marked as completed");
        }else{
            System.out.println("Invalid task number");
        }


    }

    private static void removeTask(Scanner scanner){
        System.out.println("Enter a task number to remove: ");
        int taskNumber=scanner.nextInt();
        scanner.nextLine();
        if(taskNumber>0&&taskNumber<=tasks.size()){
            tasks.remove(taskNumber-1);
            System.out.println("The task has been removed successfully");
        }else{
            System.out.println("Invalid task number");
        }

    }
}

