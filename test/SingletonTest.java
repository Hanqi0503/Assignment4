
import Singleton.SingleObject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;
import org.junit.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanqi
 */

public class SingletonTest {
    
    @Test
    public void testGetInstance() {
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();      
        assertSame(instance1, instance2);
    }
    
    @Test
    public void testShowMessage() {
        SingleObject instance = SingleObject.getInstance();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        instance.showMessage();
        System.setOut(System.out);
        assertEquals("Hello world!\n", outContent.toString());
    }

    
}