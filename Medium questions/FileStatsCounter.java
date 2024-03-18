import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStatsCounter {
    public static void main(String[] args) {
        String filePath = "textfile1.txt"; // Replace with the actual file path

        try {
            Path path = Paths.get(filePath);
            long lineCount = Files.lines(path).count();
            long wordCount = Files.lines(path)
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .filter(word -> !word.isEmpty())
                    .count();
            long charCount = Files.lines(path)
                    .mapToLong(String::length)
                    .sum();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
