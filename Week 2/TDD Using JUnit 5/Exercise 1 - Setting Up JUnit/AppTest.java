package DigitalNurture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddFunc(){
        assertEquals(5, App.add(3,2));
    }

    @Test
    public void testGreetFunc(){
        assertEquals("Hello Shanmu", App.greet("Shanmu"));
    }

    @Test
    public void testGreaterFuncTrue(){
        assertTrue(App.greater(10, 2));
        assertFalse(App.greater(2, 10));
    }
}
