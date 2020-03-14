import org.junit.Assert;
import org.junit.Test;

public class TestMaximumValue {

    private MaximumValue maximumValue;

    @Test
    public void findingMaxIntegerValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = maximumValue.getMaxvalue(7, 4, 2);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxIntegerValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = maximumValue.getMaxvalue(4, 7, 2);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxValue_GivenThreeFloat_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = maximumValue.getMaxvalue(4.5f, 7.5f, 10.9f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxValue_GivenThreeString_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = maximumValue.getMaxvalue("Honda", "Ferrari", "Bmw");
        Assert.assertEquals("Honda", maximumFloat);
    }
}
