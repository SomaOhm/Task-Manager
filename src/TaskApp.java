import java.util.Scanner;
import java.util.ArrayList;
public class TaskApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;
        do {
            System.out.println("--- To-Do List ---");
            System.out.println("1: Add Tasks");
            System.out.println("2: View Tasks");
            System.out.println("3: Remove Tasks");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //clears next line

            switch (choice) {
                case 1:
                    System.out.print("Enter your task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added");
                    break;
                case 2:
                    System.out.println("Your Tasks:");
                    if(tasks.isEmpty()){
                        System.out.println("Task List Empty");
                    }
                    else{
                        for(int i = 0; i < tasks.size(); i++){
                            System.out.println(tasks.get(i));
                        }
                    }
                    break;
                case 3: 
                    System.out.println("1: Clear All");
                    System.out.println("2: Clear Last Task");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        tasks.clear();
                    }
                    else if(choice == 2){
                        tasks.removeLast();
                    }
                    else{
                        System.out.println("Action Cancelled");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid Action. Choose between 1-4");
            } 
        }
        while(choice != 4);
    }
}
