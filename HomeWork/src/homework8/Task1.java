package homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(strings);
        markLength4(strings);
        System.out.println(strings);
    }

    public static void markLength4(List<String> strings) {
        String string = "****";
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == 4) {
                strings.add(i++, string);
            }
        }
    }
}