package homework10;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String text = "I don't believe in Zimmerman\n" +
                "I don't believe in Beatles\n" +
                "I just believe in me";
        System.out.println(countWords(text));
    }

    public static Map countWords(String string) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = string.split("[^\\w']+");
        for (String word : words) {
            map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
        }
        return map;
    }
}