package ro.jtonic.handson.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by jtonic on 14.03.2014.
 */
public class NashornMain {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager sem = new ScriptEngineManager();
        final ScriptEngine nashorn = sem.getEngineByName("nashorn");
        nashorn.eval("function sum(a, b) {return a + b;}");
        System.out.println("nashorn.eval(\"sum(1, 2);\") = " + nashorn.eval("sum(1, 2);"));
    }

}
