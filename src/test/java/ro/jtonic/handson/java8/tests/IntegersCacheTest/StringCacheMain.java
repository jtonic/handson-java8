package ro.jtonic.handson.java8.tests.IntegersCacheTest;

/**
 * Created by jtonic on 09.04.2014.
 */
public class StringCacheMain {

    public static void main(String[] args) {
        System.out.println("\"a\" == \"a\" ? " + ("a" == "a"));
        System.out.println("\"a\" == new String(\"a\") ? " + ("a" == new String("a")));
        System.out.println("\"a\" == new String(\"a\").intern() ? " + ("a" == new String("a").intern()));
    }

}
