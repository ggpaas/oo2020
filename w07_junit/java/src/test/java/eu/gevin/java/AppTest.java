package eu.gevin.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static App app;
    private static String name;
    
   
    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp(){
        name = "Gevin";
        app = new App(name);
        
    }

    @Test
    public void appHasCorrectName(){
        assertTrue("App name is Gevin", app.getName() == name);
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo(){
        //assertEquals("Checing  if one equals two", );
        assertEquals("one equals two", 1, 2);
    }

    @Test
    public void test1(){
        assertFalse(false);
    }

    @Test
    public void appsAreEqual(){
        App app1 = new App("üks");
        App app2 = new App("kaks");

        assertEquals(app1, app2);
        //kui panna app1 ja app1 siis on true
    }

    @Test
    public void notEquals(){
        App app1 = new App("1");
        App app2 = new App("2");

        assertNotEquals(app1, app2);
    }

    @Test
    public void appContactIsNull(){
        assertNull(app.getContact());
    }

    @Test
    public void appNameIsNotNull(){
        assertNotNull(app.getName());
    }
}
