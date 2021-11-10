package candy_swap;

import java.util.HashSet;
import java.util.Set;

public class CandySwapImpl implements CandySwap {

    @Override
    public int[] swap(int[] cnadiesA, int[] candiesB) {
        int sumA = 0;
        int sumB = 0;

        for (int a : cnadiesA) {
            sumA += a;
        }
        for (int b : candiesB) {
            sumB += b;
        }
        int delta = (sumB - sumA) / 2;

        Set<Integer> setB = new HashSet();
        for (int b : candiesB) {
            setB.add(b);
        }

        for (int a : cnadiesA) {
            if (setB.contains(a + delta)) {
                return new int[]{ a, a + delta };
            }
        }

        throw new RuntimeException();
    }
}
