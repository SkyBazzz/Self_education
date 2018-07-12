package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheepTest {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", Sheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Sheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Sheep.countingSheep(3));
    }
}
