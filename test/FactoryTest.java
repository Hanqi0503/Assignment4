
import Factory.Circle;
import Factory.Shape;
import Factory.Square;
import Factory.Rectangle;
import Factory.ShapeFactory;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanqi
 */

public class FactoryTest {

    @Test
    public void testGetCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = (Shape) shapeFactory.getShape("CIRCLE");

        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testGetSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = (Shape) shapeFactory.getShape("SQUARE");

        assertNotNull(square);
        assertTrue(square instanceof Square);
    }

    @Test
    public void testGetRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = (Shape) shapeFactory.getShape("Rectangle");

        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }


}