package factorial;

import java.math.BigInteger;

public class RecursiveFactorial implements Factorial {

    @Override
    public BigInteger calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be equal to zero, or larger than zero");
        }
        if (number <= 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(number).multiply(calculate(number - 1));
    }
}
