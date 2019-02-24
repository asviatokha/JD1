package homework11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources", "test.txt");
        generateFile(path, 10);
        sortFile(path);
    }

    public static void generateFile(Path path, int intCount) throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (int i = 0; i < intCount; i++) {
                writer.write(random.nextInt(100) + " ");
            }
        }
    }

    public static void sortFile(Path path) throws IOException {
        File file = path.toFile();
        List<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            }
        }
        Collections.sort(integers);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Integer integer : integers) {
                writer.write(integer + " ");
            }
        }
    }
}