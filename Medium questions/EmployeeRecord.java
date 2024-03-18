import java.util.*;

public class EmployeeRecord {
    public static void main(String[] args) {
        // Create a Map to store employee details (using employee ID as the key)
        Map<Integer, String> employeeMap = new HashMap<>();

        // Add employee records
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Carol");

        // Display employee records
        System.out.println("Employee Records: " + employeeMap);

        // Check if the map is empty
        boolean isEmpty = employeeMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Remove an employee (e.g., employee with ID 102)
        int empIdToRemove = 102;
        if (employeeMap.containsKey(empIdToRemove)) {
            String removedEmployee = employeeMap.remove(empIdToRemove);
            System.out.println("Removed employee with ID " + empIdToRemove + ": " + removedEmployee);
        } else {
            System.out.println("Employee with ID " + empIdToRemove + " not found.");
        }

        // Clear the map
        employeeMap.clear();
        System.out.println("Map cleared. New size: " + employeeMap.size());
    }
}
