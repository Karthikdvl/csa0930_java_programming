import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriterExample {
    public static void main(String[] args) {
        try {
            // Writing data to a file
            FileWriter writer = new FileWriter("output1.txt");
            writer.write("Hello, this is data written using FileWriter.");
            writer.close();
            System.out.println("Data written successfully!");

            // Reading data from the same file
            FileReader reader = new FileReader("output1.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
