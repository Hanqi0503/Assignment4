/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * Square is a concrete class that implements the Shape interface.
 * It represents a geometric square and provides the method to draw itself
 * on the console. The drawing process is simplified to a print statement
 * for demonstration purposes.
 * 
 * @author hanqi
 * @version 1.0
 */
public class Square implements Shape {
    
    /**
     * Draws the square to the console.
     * This method overrides the draw method defined in the Shape interface
     * and prints a simple text representation of a square to the console.
     */
   
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
    
}
