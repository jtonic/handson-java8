package ro.jtonic.handson.java8.tests.IntegersCacheTest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jtonic on 09.04.2014.
 */
public class JavaCaches {

    @Test
    public void testIntegersCache() {
        Integer foo = new Integer(10) + 10;
        Assert.assertTrue(foo.equals(20));
        Assert.assertTrue(foo == 20);
    }

    @Test
    public void testStringsCache() {
        Assert.assertTrue("a" == "a");
        Assert.assertFalse("a" == new String("a"));
        Assert.assertTrue("a" == new String("a").intern());
    }
}
