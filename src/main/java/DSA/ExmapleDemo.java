package DSA;

import java.util.HashMap;
import java.util.Map;

public class ExmapleDemo {
    public static Character firstRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);

            if (count == 2) {
                return ch;
            }
        }

        return null; // No repeated character
    }

    public static void main(String[] args) {
        String name = "Niraj";

        Character result = firstRepeatedChar(name.toLowerCase());

        System.out.println(result != null
                ? "First repeated character: " + result
                : "No repeated character found");
    }
}