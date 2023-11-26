/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Facade.ShapeMaker;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 *
 * @author hanqi
 */

public class FacadeTest {

    @Test
    public void testDrawCircle() {
        ShapeMaker shapeMaker = new ShapeMaker();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawCircle();

        System.setOut(System.out);

        assertEquals("Circle.draw()\n", outContent.toString());
    }

    @Test
    public void testDrawRectangle() {
        ShapeMaker shapeMaker = new ShapeMaker();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawRectangle();

        System.setOut(System.out);

        // Add assertions for the expected output of Rectangle.draw() if needed
        // For example:
        // assertEquals("Rectangle.draw()\n", outContent.toString());
    }

    @Test
    public void testDrawSquare() {
        ShapeMaker shapeMaker = new ShapeMaker();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shapeMaker.drawSquare();

        System.setOut(System.out);
        assertEquals("Square.draw()\n", outContent.toString());
    }

    private void assertEquals(String circledraw, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}