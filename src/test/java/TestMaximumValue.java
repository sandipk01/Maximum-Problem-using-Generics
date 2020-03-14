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
}
