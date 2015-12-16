package ro.jtonic.handson.java8.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by jtonic on 14.03.2014.
 */
public class NashornMain {

    public static void main(String[] args) throws ScriptException, FileNotFoundException {
        ScriptEngineManager sem = new ScriptEngineManager();
        final ScriptEngine nashorn = sem.getEngineByName("nashorn");
        nashorn.eval("function sum(a, b) {return a + b;}");
        System.out.println("nashorn.eval(\"sum(1, 2);\") = " + nashorn.eval("sum(1, 2);"));
        
        nashorn.eval(new FileReader("/home/jtonic/tmp/hello.js"));
        final String path = "/home/jtonic";
        final int sumOfFiltered = (Integer)nashorn.eval("sumOfFiltered");
        System.out.println("sumOfFiltered = " + sumOfFiltered);

        Invocable inv = (Invocable) nashorn;
        final Adder adder = inv.getInterface(Adder.class);
        final int sum = adder.sum(1, 2);
        System.out.println("sum = " + sum);
    }

}
