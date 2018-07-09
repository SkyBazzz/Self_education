package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Average.findAverage(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, Average.findAverage(new int[]{1, 2, 3}), DELTA);
    }
}