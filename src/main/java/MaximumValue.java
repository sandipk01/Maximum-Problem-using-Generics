public class MaximumValue {

    //generic method to find maximum value from given 3 values
    public <T extends Comparable> T getMaxvalue(T firstValue, T secondValue, T thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }
}
