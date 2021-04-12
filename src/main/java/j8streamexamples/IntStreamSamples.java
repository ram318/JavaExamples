package j8streamexamples;

import j8functionalexamples.MathSum;

import java.util.function.Function;
import java.util.stream.IntStream;

public class IntStreamSamples {
    public static void main(String[] args) {
        IntStream.range(1,11).reduce((a,b)->a+b).ifPresent(s-> System.out.println(s));
        IntStream.rangeClosed(1,11).reduce((a,b)->a+b).ifPresent(s-> System.out.println(s));

        int sum = IntStream.range(1,11).reduce(0,(a,b)->a+b);
        System.out.println(sum);
        int sum1 = IntStream.range(1,11).parallel().reduce(0,(a,b)->a+b);
        System.out.println(sum1);
        System.out.println(IntStream.range(1,11).parallel().reduce(0,Integer::sum));
        IntStream.range(1,11).forEach(System.out::println);

        Function<Integer, Integer> myFunction = i -> i * i;
        IntStream.range(1,11).forEach(a->System.out.format("%s ",myFunction.apply(a)));

        System.out.println("\n------------------");
        MathSum mathSum = (one,two)->one+two;
        System.out.println(IntStream.range(1,11).parallel().reduce(0, mathSum::sum));

    }
}
