/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * FacadePatternDemo contains the main method to demonstrate the use of the
 * Facade design pattern with shapes. It creates an instance of the ShapeMaker
 * class, which is a facade providing a simplified interface to draw various
 * shapes such as circles, rectangles, and squares without exposing the
 * underlying logic to the client.
 * 
 * The main method acts as the client code that utilizes the facade to perform
 * drawing operations, showcasing the ease of use provided by the facade.
 * 
 * @author hanqi
 * @version 1.0
 */
public class FacadePatternDemo {
    /**
     * Main method for the demonstration of Facade Pattern with shapes.
     * It instantiates the ShapeMaker facade and calls its methods to
     * draw different shapes.
     * 
     * @param args Command-line arguments (not used in this demo).
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        // Draw the various shapes using the ShapeMaker facade
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
