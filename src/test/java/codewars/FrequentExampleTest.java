package codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrequentExampleTest {
    @Test
    public void tests() {
        assertEquals(2, FrequentExample.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(0, FrequentExample.mostFrequentItemCount(new int[] {}
        ));
        assertEquals(5, FrequentExample.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}
