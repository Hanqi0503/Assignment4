/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 * SingleObject is a class that implements the Singleton design pattern.
 * This pattern ensures that only one instance of SingleObject is created 
 * within the application. The class provides a global access point to that 
 * instance and manages its lifetime.
 * 
 * The Singleton pattern is commonly used for managing shared resources, such
 * as a connection to a database, or for settings that need to be accessible
 * throughout an application.
 * 
 * @author hanqi
 * @version 1.0
 */
public class SingleObject {
    
    // The single instance of the class, created eagerly at class loading.
    private static SingleObject instance = new SingleObject();
    
    /**
     * Private constructor to prevent instantiation from outside the class.
     * This is essential for the Singleton pattern, ensuring that the instance
     * is controlled within the class itself.
     */
    private SingleObject(){};
 
    /**
     * Provides the global point of access to the SingleObject instance.
     * Since the instance is created at the time of class loading, this method
     * simply returns that instance.
     * 
     * @return The singleton instance of SingleObject.
     */
    public static SingleObject getInstance(){
        return instance;
    }
    
    /**
     * A method to demonstrate the functionality of the singleton instance.
     * This could be replaced with more complex business logic specific to
     * the application's needs.
     */
    public void showMessage(){
        System.out.println("Hello world!");
    }
    
}
