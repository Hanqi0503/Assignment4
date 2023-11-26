/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * Rectangle is a concrete class implementing the Shape interface, representing
 * a geometric rectangle. This class provides the implementation details for
 * the draw method, which is responsible for drawing the rectangle. Currently,
 * the drawing is simulated by printing a statement to the console.
 * The Rectangle is a fundamental shape in many graphical applications, and this
 * class can be extended to include more detailed drawing features such as line
 * thickness, fill patterns, and color.
 * 
 * @author hanqi
 * @version 1.0
 */
public class Rectangle implements Shape {
    /**
     * Draws the rectangle to the console.
     * Overrides the draw method of the Shape interface. The drawing action
     * is simplified as a console output, which indicates that a rectangle
     * has been drawn. This method can be expanded to include actual drawing
     * mechanisms in a graphical context.
     */
    
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
    
}
