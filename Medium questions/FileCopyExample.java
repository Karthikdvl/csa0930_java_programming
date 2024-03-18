import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("output.txt")) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
