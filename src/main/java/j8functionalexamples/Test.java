package j8functionalexamples;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.*;

public class Test {

    public static void main(String args[]) {
        Integer a = null;
        int b = 2;
        Optional<Integer> oA = Optional.ofNullable(a);
        OptionalInt oB = OptionalInt.of(b);
        System.out.println((int) (oA.isPresent() ? oA.get() : 0) + oB.getAsInt());

        Supplier<Integer> myOTP = () -> 1234;
        Consumer<Integer> myCon = c -> System.out.println(c = 1234);
        Function<Integer, Integer> myFunction = i -> i * i;
        BiFunction<Integer, Integer, Integer> mybiFunction = (i, j) -> i * j;
        Predicate<Integer> myPred = i -> i>0;

        myCon.accept(oA.isPresent()?oA.get():0);

        System.out.println(oB.getAsInt() + (oA.orElseGet(myOTP)));
        System.out.println("The square root of " + oB.getAsInt() + " is " + myFunction.apply(oB.getAsInt()));
        System.out.printf("The multiplication of %d and %d is %d ", oA.get(), oB.getAsInt(), (int) (mybiFunction.apply(oA.get(), oB.getAsInt())));


    }
}
