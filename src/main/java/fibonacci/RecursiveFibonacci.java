package fibonacci;

public class RecursiveFibonacci implements Fibonacci {

    @Override
    public long calculate(int number) {
        if (number == 0) {
           return 0L;
        }
        if (number == 1) {
            return 1L;
        }
        return calculate(number - 1) + calculate(number - 2);
    }
}
