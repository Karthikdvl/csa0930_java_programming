import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String contentToWrite = "Computer Science and Engineering";

        // Write the content to a file
        String fileName = "mytextfile.txt"; // Change this to your desired file name
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(contentToWrite);
            System.out.println("Content written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read the content from the file
        try (FileReader fileReader = new FileReader(fileName)) {
            int character;
            StringBuilder contentRead = new StringBuilder();
            while ((character = fileReader.read()) != -1) {
                contentRead.append((char) character);
            }
            System.out.println("Content read from file: " + contentRead);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
