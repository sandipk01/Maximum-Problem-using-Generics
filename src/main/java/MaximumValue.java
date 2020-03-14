public class MaximumValue {

    //method to find maximum value from given 3 integer
    public Integer getMaxInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }
}
