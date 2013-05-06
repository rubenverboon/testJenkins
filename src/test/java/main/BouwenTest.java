package main;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Ruben
 * Date: 17-6-13
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 * comment 2
 */
public class BouwenTest {

    @Test
    public void testSchrijf() {
        Bouwen.schrijf();
        Assert.assertTrue(true);
    }
}
