# Setting Up JUnit 5 with Maven

- **Step 1:** Download Maven and Add it to `PATH` Variable
- **Step 2:** Create a `pom.xml` (or) Use the command line tool `mvn` to create a project

```
    mvn archetype:generate -DgroupId=packageName -DartifactId=projectName -DinteractiveMode=false
```

- **Step 3:** Add the following dependency (if not already in there) to `pom.xml`.

```
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
```

- **Step 4:** Create a Test class in your project.

```
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
```
