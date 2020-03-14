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
    public void findingMaxIntegerValue_GivenThirdParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = maximumValue.getMaxvalue(4, 2, 7);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxFloatValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = maximumValue.getMaxvalue(10.9f, 4.5f, 7.5f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxFloatValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = maximumValue.getMaxvalue(4.5f, 10.9f, 7.5f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxFloatValue_GivenThirdParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = maximumValue.getMaxvalue(4.5f,7.5f , 10.9f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxStringValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = maximumValue.getMaxvalue("Honda", "Ferrari", "Bmw");
        Assert.assertEquals("Honda", maximumFloat);
    }

    @Test
    public void findingMaxStringValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = maximumValue.getMaxvalue("Ferrari", "Honda", "Bmw");
        Assert.assertEquals("Honda", maximumFloat);
    }
}
