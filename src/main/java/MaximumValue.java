public class MaximumValue<T extends Comparable> {

    //variables with generic type
    private T firstValue;
    private T secondValue;
    private T thirdValue;

    //parameter less constructor
    public MaximumValue() {
    }

    //parameter taking three generic type values
    public MaximumValue(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //generic method to find maximum value from given 3 values
    public T getMaxValue(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }

    //method to call getMaxValue method
    public <T extends Comparable> T testMaximum() {
        printMaximum(getMaxValue(firstValue, secondValue, thirdValue));
        return (T) getMaxValue(firstValue, secondValue, thirdValue);
    }

    //method to printing maximum value
    public void printMaximum(T value) {
        System.out.println("Maximum value is : " + value);
    }
}
