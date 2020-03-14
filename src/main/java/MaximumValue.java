public class MaximumValue {

    //method to find maximum value from given 3 integer values
    public Integer getMaxInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }

    //method to find maximum value from given 3 float values
    public Float getMaxFloat(Float firstValue, Float secondValue, Float thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }

    //method to find maximum value from given 3 strings
    public String getMaxString(String firstValue, String secondValue, String thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        return thirdValue;
    }
}
