/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 * Shape is an interface for geometric shapes that can be drawn.
 * This interface is part of the Facade pattern, where it acts as
 * an abstraction for various types of shapes that need to be drawn.
 * @author hanqi
 * @version 1.0
 */
public interface Shape {
    /**
     * Draw the shape on the appropriate surface or medium.
     * The specifics of how the shape is drawn are left to the
     * implementing classes.
     */
    void draw();
    
}
