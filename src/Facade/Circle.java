/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * Circle is a concrete class that implements the Shape interface.
 * It encapsulates the characteristics of a geometric circle and
 * defines how it is drawn, in this case, outputting a message to
 * the console. The method provided for drawing demonstrates the
 * circle's ability to perform its primary function within a graphical
 * application's facade pattern structure.
 * 
 * @author hanqi
 * @version 1.0
 */
public class Circle implements Shape {
    /**
     * Draws the circle to the console.
     * This method overrides the draw method in the Shape interface
     * and provides a simple console output to simulate the drawing
     * of a circle.
     */
    @Override
    public void draw() {
        
        System.out.println("Circle::draw()");
    }
    
}
