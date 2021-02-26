package it.unibo.wenvusage;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBoundaryWalk
{
    @Test
    public void run() {
        System.out.println("testAppHasAGreeting");
        BoundaryWalk bw = new BoundaryWalk();
        Boolean response = bw.run();
        assertTrue(response == true);

    }
}
