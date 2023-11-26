/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 * FactoryPatternDemo contains the main method to demonstrate the use of the
 * Factory design pattern in creating various shape objects. This class serves
 * as the client for the ShapeFactory, requesting and receiving various shape
 * instances and then calling their draw methods.
 * 
 * This demonstration showcases the flexibility and decoupling provided by the
 * Factory pattern in object creation, where the client is unaware of the
 * concrete classes creating the shape instances.
 * 
 * @author hanqi
 * @version 1.0
 */
public class FactoryPatternDemo {
    
    /**
     * Main method to demonstrate the Factory Pattern with shapes.
     * It creates a ShapeFactory instance and uses it to instantiate
     * different shapes (Circle, Rectangle, and Square) by providing
     * their type names. After obtaining these shapes, their draw methods
     * are called to demonstrate the creation and functionality of each shape.
     * 
     * @param args Command-line arguments (not used in this demo).
     */
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        
        //call draw method of Circle
        shape1.draw();
        
        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        
        //call draw method of Rectangle
        shape2.draw();
        
        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        
        //call draw method of circle
        shape3.draw();
    }
}
