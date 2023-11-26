/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateDesign;

/**
 *
 * @author hanqi
 */
public class Rover {
    private State atRestState;
    private State moveForwardState;
    private State moveBackwardState;
    private State currentState;

    public Rover() {
        atRestState = new AtRest(this);
        moveForwardState = new MoveForward(this);
        moveBackwardState = new MoveBackward(this);
        currentState = atRestState; // Initial state is at rest
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getState() {
        return currentState;
    }

    public State getAtRestState() {
        return atRestState;
    }

    public State getMoveForwardState() {
        return moveForwardState;
    }

    public State getMoveBackwardState() {
        return moveBackwardState;
    }

    public void moveForward() {
        currentState.moveForward();
    }

    public void moveBackward() {
        currentState.moveBackward();
    }

    public void rest() {
        currentState.rest();
    }
}
