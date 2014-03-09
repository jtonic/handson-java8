package ro.jtonic.handson.java8.lambdas;

public class InnerClassExamples {
    public static void main(String... args) {
        InstanceOuter io = new InstanceOuter(12);

        // Is this a compile error?
        InstanceOuter.InstanceInner ii = io.new InstanceInner();

        // What does this print?
        ii.printSomething(); // prints 12

        // What about this?
        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.printSomething(); // prints 24
    }
}