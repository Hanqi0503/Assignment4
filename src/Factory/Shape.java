/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 * Shape is an interface for geometric shapes within the Factory pattern.
 * It defines a common method to be implemented by all concrete shape
 * classes that can be created by the shape factory. The draw method
 * is intended to be called to draw the specific shape.
 * 
 * The Factory pattern ensures that the instantiation of a shape is
 * done through a factory class, which returns an instance of Shape.
 * This allows for greater flexibility and encapsulation of the 
 * object creation process.
 * @author hanqi
 * @version 1.0
 */
public interface Shape {
    /**
     * Draw the shape to the desired medium. Implementations of this
     * interface are expected to provide their own drawing logic which
     * could be on various platforms like console, graphical user interface,
     * or web interface.
     */
    void draw();
    
}
