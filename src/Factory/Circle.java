/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 * Circle is a concrete class that implements the Shape interface in the
 * Factory design pattern context. This class provides the specific implementation
 * for the draw method, tailored for a circle. It is one of the shapes that
 * can be instantiated through the ShapeFactory.
 * 
 * The implementation of the draw method here is a simplified representation
 * of drawing a circle, which is demonstrated through console output. In a
 * more complex application, this could involve detailed graphics rendering.
 * 
 * @author hanqi
 * @version 1.0
 */
public class Circle implements Shape {
    /**
     * Draws the circle by outputting a message to the console. This method
     * exemplifies the draw functionality for a circle and would be replaced
     * or expanded upon with actual drawing logic in a complete graphical
     * application.
     * 
     * Overrides the draw method from the Shape interface.
     */

    
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
