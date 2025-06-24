package DigitalNurture;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    ExternalAPI api;
    App app;

    @BeforeEach
    public void setup(){
        api = mock(ExternalAPI.class);
        when(api.getData()).thenReturn("Some Data");

        app = new App(api);
    }

    @Test
    public void testData(){
        String formattedData = app.getFormattedData();

        assertEquals("Some Formatted Data: Some Data", formattedData);

        // Verifying if the function was called
        verify(api).getData(); // This will reasult in a FAIL if getData() was not called at all.
    }
}
