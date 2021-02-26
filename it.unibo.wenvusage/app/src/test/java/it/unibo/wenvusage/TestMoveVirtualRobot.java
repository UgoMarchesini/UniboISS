package it.unibo.wenvusage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestMoveVirtualRobot
{
    /*
    @Before
    public void Back() {

        MoveVirtualRobot m = new MoveVirtualRobot();
        m.moveBackward(500);

        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void GoAhead() {
        System.out.println("testAppHasAGreeting");
        MoveVirtualRobot m = new MoveVirtualRobot();
        m.moveBackward(500);
        m.moveForward(500);
        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
*/
    @Test public void Tour() {
        System.out.println("testAppHasAGreeting");
        MoveVirtualRobot m = new MoveVirtualRobot();

        m.moveForward(400);
        m.moveLeft(500);
        m.moveForward(600);
        m.moveRight(500);
        m.moveForward(600);
        m.moveRight(500);
        m.moveForward(600);
        m.moveLeft(500);
        m.moveForward(500);
        m.moveBackward(1200);
        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
