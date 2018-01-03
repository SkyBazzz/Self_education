package codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
        assertEquals(676, NumberFun.findNextSquare(625));
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}
