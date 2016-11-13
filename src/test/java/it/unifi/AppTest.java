package it.unifi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private App app;
    @Before
    public void setup() { app = new App();
    }
    @org.junit.Test
    public void testSayHello() { assertEquals("Hello", app.sayHello());
    }
    @org.junit.Test
    public void testSayHelloWithName() {
        assertEquals("Hello World", app.sayHello("World"));
    }

}