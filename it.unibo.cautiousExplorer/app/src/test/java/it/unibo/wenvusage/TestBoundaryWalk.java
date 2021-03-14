package it.unibo.boundaryWalk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBoundaryWalk
{
    @Test
    public void run() {
        System.out.println("run");
        BoundaryWalk bw = new BoundaryWalk();
        Boolean response = bw.run();
        assertTrue(response == true);

    }
}
