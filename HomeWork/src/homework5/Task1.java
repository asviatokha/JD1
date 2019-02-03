package homework5;

public class Task1 {
    public static void main(String[] args) {
        String[] values = {"racecar", "random string",
                "A man, a plan, a canal, Panama!",
                "Was it a car or a cat I saw?"};
        for (String value : values) {
            System.out.println(value + " Is palindrome? " + isPalindrome(value));
        }
    }

    public static boolean isPalindrome(String value) {
        String revValue = "";
        String updValue = value.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < updValue.length(); i++) {
            revValue = updValue.charAt(i) + revValue;
        }

        return revValue.equals(updValue);
    }
}
