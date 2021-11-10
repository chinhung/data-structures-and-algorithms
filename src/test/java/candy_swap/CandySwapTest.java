package candy_swap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CandySwapTest {

    @Test
    public void testSwap() {
        CandySwap candySwap = new CandySwapImpl();

        int[] candiesA = new int[]{ 1, 3, 5 };
        int[] candiesb = new int[]{ 2, 5, 1, 6, 7 };

        assertArrayEquals(new int[]{ 1, 7 }, candySwap.swap(candiesA, candiesb));
    }
}
