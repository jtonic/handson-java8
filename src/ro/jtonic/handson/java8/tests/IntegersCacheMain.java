package ro.jtonic.handson.java8.tests;

/**
 * Created by jtonic on 09.04.2014.
 */
public class IntegersCacheMain {
    public static void main(String[] args) {
        Integer foo = new Integer(10) + 10;
        if (foo.equals(20)) {
            System.out.println("foo");
        } else {
            System.out.println("bar");
        }

        if (foo == Integer.valueOf(20)) {
            System.out.println("foo");
        } else {
            System.out.println("bar");
        }
    }
}
