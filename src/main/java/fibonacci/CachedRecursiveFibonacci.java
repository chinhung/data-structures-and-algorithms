package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class CachedRecursiveFibonacci implements Fibonacci {

    private Map<Integer, Long> cache;

    public CachedRecursiveFibonacci() {
        this.cache = new HashMap<>();
    }

    @Override
    public long calculate(int number) {
        if (number == 0) {
            return 0L;
        }
        if (number == 1) {
            return 1L;
        }
        
        Long cachedValue = cache.get(number);
        if (cachedValue != null) {
            return cachedValue;
        }

        Long calculated = calculate(number - 1) + calculate(number - 2);
        cache.put(number, calculated);
        return calculated;
    }
}
