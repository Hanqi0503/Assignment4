/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * ShapeMaker is a class that provides a simplified interface to draw various types
 * of shapes such as circle, rectangle, and square. This class acts as a facade to
 * hide the complexities of the individual shape classes and their drawing methods.
 * It utilizes the Shape interface to delegate the drawing calls to the appropriate
 * shape implementations.
 * @author hanqi
 * @version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    /**
     * Constructor for ShapeMaker. Initializes the shapes to be drawn.
     */
    
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    /**
     * Draws a circle by delegating the call to the circle's draw method.
     */
    
    public void drawCircle(){
        circle.draw();
    }
    
    /**
     * Draws a rectangle by delegating the call to the rectangle's draw method.
     */
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    /**
     * Draws a square by delegating the call to the square's draw method.
     */
    
    public void drawSquare(){
        square.draw();
    }
}
