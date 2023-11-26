/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 * SingletonPatternDemo contains the main method to demonstrate the use of the
 * Singleton design pattern. This class showcases how to access the single instance
 * of the SingleObject class and calls a method on that instance.
 * 
 * The demonstration here focuses on obtaining the SingleObject instance through
 * its static method getInstance and then using this instance to perform an action,
 * showcasing the Singleton pattern's ability to maintain a single instance
 * throughout the application.
 * 
 * @author hanqi
 * @version 1.0
 */
public class SingletonPatternDemo {
    
    /**
     * Main method for the demonstration of the Singleton Pattern.
     * It retrieves the single instance of SingleObject and then invokes
     * the showMessage method on that instance.
     * 
     * @param args Command-line arguments (not used in this demo).
     */

    public static void main(String[] args) {
        
        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        
        //Show the message
        object.showMessage();
    }
    
}

