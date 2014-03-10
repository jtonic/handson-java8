package ro.jtonic.handson.java8.functional;

import java.util.Arrays;
import java.util.List;

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
    }

}
