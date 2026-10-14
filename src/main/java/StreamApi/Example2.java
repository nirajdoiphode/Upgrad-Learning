package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("one","two","three","four","five","six","seven","eight","nine");

        Map<Integer, List<String>> hashmap=words.stream().collect(Collectors.groupingBy(word-> word.length()));
        Map<Character,Long> hashmap2=words.stream().collect(Collectors.groupingBy(word->word.charAt(0),Collectors.counting()));

        System.out.println(hashmap2);
    }
}
