import java.util.Hashtable;
import java.util.Enumeration;

public class BankDetails {
    public static void main(String[] args) {
        // Create a Hashtable to store bank details
        Hashtable<Integer, String> bankTable = new Hashtable<>();

        // Add 3 records
        bankTable.put(1001, "Alice");
        bankTable.put(1002, "Bob");
        bankTable.put(1003, "Carol");

        // Display records
        System.out.println("Bank Details:");
        Enumeration<Integer> accountNumbers = bankTable.keys();
        while (accountNumbers.hasMoreElements()) {
            int accountNumber = accountNumbers.nextElement();
            String customerName = bankTable.get(accountNumber);
            System.out.println("Account Number: " + accountNumber + ", Customer Name: " + customerName);
        }

        // Display the size of the Hashtable
        int size = bankTable.size();
        System.out.println("Size of the Hashtable: " + size);

        // Clear the Hashtable
        bankTable.clear();
        System.out.println("Hashtable cleared. New size: " + bankTable.size());
    }
}
