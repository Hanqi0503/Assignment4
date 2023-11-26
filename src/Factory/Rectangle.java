/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * Rectangle is a concrete implementation of the Shape interface within
 * the Factory design pattern. This class provides the specific logic for
 * drawing a rectangle, as part of the family of shapes that can be created
 * through the ShapeFactory.
 * 
 * The draw method of this class outputs a simple message to the console,
 * serving as an example of the drawing action. In a fully implemented
 * graphical application, this method would include detailed graphics
 * rendering logic.
 * 
 * @author hanqi
 * @version 1.0
 */
public class Rectangle implements Shape {
    /**
     * Draws the rectangle by printing a message to the console.
     * This method is an example of how the draw functionality might be
     * implemented for a rectangle in a graphical application.
     * 
     * Overrides the draw method defined in the Shape interface.
     */

    
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    
}
