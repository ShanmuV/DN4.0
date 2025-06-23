package DigitalNurture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app; // Test Fixture

    // Before tag
    @BeforeEach
    public void setup(){
        app = new App(); // Initializing Test fixture
        System.out.println("Here goes the Initialization code for each test");
    }

    @Test
    public void testAddFunc(){
        // AAA Pattern - Arrange
        int expectedResult = 5;

        // AAA Pattern - Act
        int result = app.add(3,2);

        // AAA - Pattern - Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGreetFunc(){
        // AAA Pattern - Arrange
        String expectedResult = "Hello Shanmu";

        // AAA Pattern - Act
        String result = app.greet("Shanmu");

        // AAA - Pattern - Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGreaterFuncTrue(){
        // AAA Pattern - Arrange - Nothing to arrange

        // AAA Pattern - Act
        boolean resultTrue = app.greater(5,3);
        boolean resultFalse = app.greater(3,5);

        // AAA - Pattern - Assert
        assertTrue(resultTrue);
        assertFalse(resultFalse);

    }

    @AfterEach
    public void cleanUp(){
        System.out.println("Here goes the cleanup code after each test");
    }
}
