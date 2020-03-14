import org.junit.Assert;
import org.junit.Test;

public class TestMaximumValue {

    private MaximumValue maximumValue;

    @Test
    public void findingMaxValue_GivenThreeIntegers_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = maximumValue.getMaxInteger(7, 4, 2);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxValue_GivenThreeFloat_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat=maximumValue.getMaxFloat(4.5f,7.5f,10.9f);
        Assert.assertEquals((Float)10.9f,maximumFloat);
    }
}
