/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 * Square is a concrete class that implements the Shape interface within
 * the context of the Factory design pattern. It provides the specific
 * implementation details for the draw method for a square shape.
 * This class is one of the shape types that can be instantiated by the
 * ShapeFactory.
 * 
 * The draw method in this class is meant to represent the action of drawing
 * a square, which is, in this simplified example, outputting a message to the
 * console.
 *
 * @author hanqi
 * @version 1.0
 */
public class Square implements Shape {
    /**
     * Draws the square by printing a message to the console. This method
     * serves as an example of how the draw functionality might be implemented
     * in a graphical application.
     * 
     * The method overrides the draw method from the Shape interface.
     */
    
    @Override
    public void draw() {
        System.out.println("Inside Sqaure::draw() method.");
    }
    
}
