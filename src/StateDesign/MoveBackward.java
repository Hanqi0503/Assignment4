/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateDesign;

/**
 *
 * @author hanqi
 */
public class MoveBackward implements State {
    private Rover rover;

    public MoveBackward(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void moveForward() {
        System.out.println("Rover is moving forward.");
        rover.setState(rover.getMoveForwardState());
    }

    @Override
    public void moveBackward() {
        System.out.println("Rover is already moving backward.");
    }

    @Override
    public void rest() {
        System.out.println("Rover is stopping.");
        rover.setState(rover.getAtRestState());
    }
}

