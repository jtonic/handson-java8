package ro.jtonic.handson.java8.inner;

class InstanceOuter {

    private int x;

    public InstanceOuter(int xx) {
        x = xx;
    }

    class InstanceInner {
        public void printSomething() {
            System.out.println("The value of x in my outer is " + x);
        }
    }
}
