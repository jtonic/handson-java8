package ro.jtonic.handson.java8.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ***********************************************************************
 * <p/>
 * <b>Authors:</b>
 * Antonel (Tony) Pazargic (antonel.pazargic@1and1.ro)
 * <p/><b>Date:</b> 4/4/13
 * <p/><b>Time:</b> 7:58 PM
 * <p/>
 * ***********************************************************************
 */
public class MainClazz {

    public static void main(String[] args) throws InterruptedException {
        schedule(() -> System.out.println("Hello world!!!"));

        final List<String> versions = Arrays.asList("Java 7", "Java 8");

        versions.sort(String::compareTo);
        System.out.println("versions 1 = " + versions);

        versions.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("versions 2 = " + versions);

        versions.stream().filter(s -> s.equals("Java 8")).map(s -> String.format("Develop %s with pleasure", s)).forEach(System.out::println);

        Runnable runnable = () -> System.out.println("Running using lambda expression");
        Thread t = new Thread(runnable);
        t.start();
        t.join();


        Comparator<String> c = (left, right) -> left.compareTo(right);
        final int result = c.compare("Hello", "World");
        System.out.println("result = " + result);
    }

    private static void schedule(ITask task) {
        task.run();
    }

    private static interface ITask {
        public void run();
    }

    private static void isLambdaAssignableToObject() {
//        Object lambda1 = () -> System.out.println("Hello world"); does not compile
        Object lambda2 = (Runnable) () -> System.out.println("Hello world");
    }

}
