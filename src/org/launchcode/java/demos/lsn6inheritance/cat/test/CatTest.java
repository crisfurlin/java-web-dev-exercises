package org.launchcode.java.demos.lsn6inheritance.cat.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.cat.main.HouseCat;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
