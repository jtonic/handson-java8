package ro.jtonic.handson.java8.lambdas;

class StaticOuter {

    static class StaticInner {
        public void printSomething() {
            System.out.println("The value of x in my outer is " + x);
        }
    }

    private static int x = 24;
}