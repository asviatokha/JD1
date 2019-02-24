package homework11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Path poem = Paths.get("resources", "poem.txt");
        Path results = Paths.get("resources", "results.txt");
        try {
            saveResults(countLetters(poem), results);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Map<String, Integer> countLetters(Path source) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(source.toFile())))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().toLowerCase().replaceAll("[^а-я]", "");
                String[] letters = line.split("");
                for (String letter : letters)
                    result.put(letter, result.containsKey(letter) ? result.get(letter) + 1 : 1);
            }
        }
        return result;
    }

    private static void saveResults(Map<String, Integer> results, Path path) throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (String letter : results.keySet()) {
                writer.write(letter + " - " + results.get(letter) + "\n");
            }
        }
    }
}