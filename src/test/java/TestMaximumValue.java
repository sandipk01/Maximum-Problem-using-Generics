import org.junit.Assert;
import org.junit.Test;

public class TestMaximumValue {

    private MaximumValue maximumValue;

    @Test
    public void findingMaxIntegerValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = (Integer) maximumValue.getMaxValue(7, 4, 2);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxIntegerValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = (Integer) maximumValue.getMaxValue(4, 7, 2);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxIntegerValue_GivenThirdParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Integer maximumInteger = (Integer) maximumValue.getMaxValue(4, 2, 7);
        Assert.assertEquals((Integer) 7, maximumInteger);
    }

    @Test
    public void findingMaxFloatValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = (Float) maximumValue.getMaxValue(10.9f, 4.5f, 7.5f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxFloatValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = (Float) maximumValue.getMaxValue(4.5f, 10.9f, 7.5f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxFloatValue_GivenThirdParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        Float maximumFloat = (Float) maximumValue.getMaxValue(4.5f,7.5f , 10.9f);
        Assert.assertEquals((Float) 10.9f, maximumFloat);
    }

    @Test
    public void findingMaxStringValue_GivenFirstParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = (String) maximumValue.getMaxValue("Honda", "Ferrari", "Bmw");
        Assert.assertEquals("Honda", maximumFloat);
    }

    @Test
    public void findingMaxStringValue_GivenSecondParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = (String) maximumValue.getMaxValue("Ferrari", "Honda", "Bmw");
        Assert.assertEquals("Honda", maximumFloat);
    }

    @Test
    public void findingMaxStringValue_GivenThirdParameter_ShouldReturnMaxValue() {
        maximumValue = new MaximumValue();
        String maximumFloat = (String) maximumValue.getMaxValue("Ferrari", "Bmw", "Honda");
        Assert.assertEquals("Honda", maximumFloat);
    }

    @Test
    public void findingMaxIntegerValue_GivenFromConstructor_ShouldReturnMaxValue() {
        maximumValue=new MaximumValue(7,4,5);
        Integer maximumInteger=(Integer) maximumValue.testMaximum();
        Assert.assertEquals((Integer)7,maximumInteger);
    }

    @Test
    public void findingMaxFloatValue_GivenFromConstructor_ShouldReturnMaxValue() {
        maximumValue=new MaximumValue(10.5f,4.8f,7.4f);
        Float maximumInteger=(Float) maximumValue.testMaximum();
        Assert.assertEquals((Float)10.5f,maximumInteger);
    }
}
