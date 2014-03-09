package ro.jtonic.handson.java8.lambdas;

/**
 * Created by jtonic on 09.03.2014.
 */
public class OutsideReferencesInLambdaMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int old = 10;
        Runnable r = () -> {
            System.out.println("sb.toString() = " + sb.toString());
            System.out.println("old = " + old);
        };
        sb.append("Howdy, ");
        sb.append("world!!!");
        r.run();
    }
}
