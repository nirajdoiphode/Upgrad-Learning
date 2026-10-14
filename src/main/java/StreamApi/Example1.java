package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);


        numbers.stream().filter(n->n%2!=0).map(n->n*n).forEach(System.out::println);

        int result= numbers.stream().filter(n->n%2==1).map(n->n*n)
                .reduce(0,(acc, n)->acc+n);
        System.out.println("Sum: "+result);

        int max=numbers.stream().mapToInt(n->(int)n).max().orElse(0);
        System.out.println("MAX:"+max);



        List<String> months=Arrays.asList("January","August","March","july","june");

        System.out.println("\n\n Months having length greater than 5: ");
        months.stream().filter(n->(n.length())>4).forEach(System.out::println);


        System.out.println("\n\n Months starting with J:");
        months.stream().filter(month->month.startsWith("J")).forEach(month-> System.out.println(month));


    }
}
