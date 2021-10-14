package fibonacci;

class ValidateNumberDecorator implements Fibonacci {

    private Fibonacci algorithm;

    ValidateNumberDecorator(Fibonacci algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public long calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be equal to zero, or larger than zero");
        }
        return algorithm.calculate(number);
    }
}
