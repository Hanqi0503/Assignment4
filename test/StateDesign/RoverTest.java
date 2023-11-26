/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StateDesign;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanqi
 */


public class RoverTest {
    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void testInitialStateIsAtRest() {
        assertTrue(rover.getState() instanceof AtRest);
    }

    @Test
    public void testMoveForwardFromRest() {
        rover.moveForward();
        assertTrue(rover.getState() instanceof MoveForward);
    }

    @Test
    public void testMoveBackwardFromForward() {
        rover.moveForward(); // Set to MoveForward state
        rover.moveBackward(); // Should transition to MoveBackward state
        assertTrue(rover.getState() instanceof MoveBackward);
    }

    @Test
    public void testRestFromBackward() {
        rover.moveBackward(); // Set to MoveBackward state
        rover.rest(); // Should transition to AtRest state
        assertTrue(rover.getState() instanceof AtRest);
    }
}

