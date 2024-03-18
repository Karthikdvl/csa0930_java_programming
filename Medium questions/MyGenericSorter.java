import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyGenericSorter<T extends Comparable<T>> {
    private List<T> values;

    public MyGenericSorter() {
        values = new ArrayList<>();
    }

    public void addValue(T value) {
        values.add(value);
    }

    public void sortValues() {
        Collections.sort(values);
    }

    public List<T> getSortedValues() {
        return values;
    }

    public static void main(String[] args) {
        MyGenericSorter<Integer> intSorter = new MyGenericSorter<>();
        intSorter.addValue(5);
        intSorter.addValue(2);
        intSorter.addValue(8);
        intSorter.sortValues();

        System.out.println("Sorted Integer Values: " + intSorter.getSortedValues());

        MyGenericSorter<String> stringSorter = new MyGenericSorter<>();
        stringSorter.addValue("Apple");
        stringSorter.addValue("Banana");
        stringSorter.addValue("Cherry");
        stringSorter.sortValues();

        System.out.println("Sorted String Values: " + stringSorter.getSortedValues());
    }
}
