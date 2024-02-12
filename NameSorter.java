import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter names (one per line), type 'done' to finish:");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Order (A/D): ");
        String order = scanner.nextLine();

        if (order.equalsIgnoreCase("A")) {
            Collections.sort(names);
        } else if (order.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order choice. Please choose 'A' for ascending or 'D' for descending.");
            return;
        }

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}