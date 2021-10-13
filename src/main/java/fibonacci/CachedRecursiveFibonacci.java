package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class CachedRecursiveFibonacci implements Fibonacci {

    private Map<Integer, Long> cache;

    public CachedRecursiveFibonacci() {
        this.cache = new HashMap<>();
        this.cache.put(0, 0L);
        this.cache.put(1, 1L);
    }

    @Override
    public long calculate(int number) {
        Long cachedValue = cache.get(number);
        if (cachedValue != null) {
            return cachedValue;
        }

        Long calculated = calculate(number - 1) + calculate(number - 2);
        cache.put(number, calculated);
        return calculated;
    }
}
