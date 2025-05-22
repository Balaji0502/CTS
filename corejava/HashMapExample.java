import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            scanner.nextLine();
            if (id == -1) {
                break;
            }
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("\nEnter a student ID to search: ");
        int searchId = sc.nextInt();
        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }
        sc.close();
    }
}
