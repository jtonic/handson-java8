package ro.jtonic.handson.java8.inner;

class Hello {
    public Runnable r1 = new Runnable() {
        public void run() {
            System.out.println(this);
            System.out.println(toString());
        }
    };

    public Runnable r2 = () -> {
        System.out.println(this);
        System.out.println(toString());
    };

    public String toString() {
        return "Hello's custom toString()";
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.r1.run();
        h.r2.run();
    }
}
