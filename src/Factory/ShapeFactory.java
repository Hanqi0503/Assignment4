/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *ShapeFactory is a class that follows the Factory design pattern.
 * It provides a method to get instances of different shapes such as
 * circle, rectangle, and square based on the provided shape type.
 * The purpose of this factory is to encapsulate the instantiation logic
 * and to provide a central point to perform the instantiation of Shape
 * objects, which promotes loose coupling and high cohesion within the
 * application.
 * 
 * @author hanqi
 * @version 1.0
 */
public class ShapeFactory {
    //use getShape method to get object of type shape
    /**
     * Gets an instance of a shape based on the specified shape type.
     * The method compares the provided shapeType string to determine
     * which shape to instantiate and return.
     * 
     * @param shapeType The type of shape to create, expected to be
     *                  a non-null string such as "CIRCLE", "RECTANGLE",
     *                  or "SQUARE".
     * @return An instance of a class that implements the Shape interface,
     *         corresponding to the specified shape type. Returns null if
     *         the shapeType is not recognized or is null.
     */

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
            
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
            
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        
        return null;
        
    }
    
}

