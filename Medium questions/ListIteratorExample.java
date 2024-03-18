import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>(Arrays.asList("C", "A", "E", "B", "D", "F"));

        // Create a ListIterator
        ListIterator<String> listIterator = elements.listIterator();

        // Append "+" to each element
        while (listIterator.hasNext()) {
            String originalElement = listIterator.next();
            String modifiedElement = originalElement + "+";
            listIterator.set(modifiedElement);
        }

        // Print modified elements in reverse order
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
