package fibonacci;

public class ArrayFibonacci implements Fibonacci {

    ArrayFibonacci() {
    }

    @Override
    public long calculate(int number) {
        if (number == 0) {
            return 0L;
        }
        if (number == 1) {
            return 1L;
        }

        long[] results = new long[number + 1];
        results[0] = 0L;
        results[1] = 1L;

        for (int i = 2; i < results.length; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }

        return results[results.length - 1];
    }

    public static Fibonacci factory() {
        return new ValidateNumberDecorator(new ArrayFibonacci());
    }
}
