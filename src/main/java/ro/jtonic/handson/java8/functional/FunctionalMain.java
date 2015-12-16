package ro.jtonic.handson.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by jtonic on 10.03.2014.
 */
public class FunctionalMain {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);

        final Integer sum = l.stream().reduce(0, (lhs, rhs) -> lhs + rhs);
        final Integer sum1 = l.stream().reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
        System.out.println("sum1 = " + sum1);

        final String a1 = "A1";
        final String a2 = null;
        final String b1 = Optional.ofNullable(a1).orElse("A1_Default");
        System.out.println("b1 = " + b1);
        final String b2 = Optional.ofNullable(a2).orElse("A2_Default");
        System.out.println("b2 = " + b2);
    }

}
