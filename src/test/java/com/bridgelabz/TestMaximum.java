package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,Maximum.getMax(90,40,10));
    }

    @Test
    public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,Maximum.getMax(40,90,10));
    }

    @Test
    public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Integer expected = 90 ;
        Assert.assertEquals(expected,Maximum.getMax(40,10,90));
    }
    @Test
    public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Float expected = 5.6f ;
        Assert.assertEquals(expected,Maximum.getMax(5.6f,4.2f,2.2f));
    }

    @Test
    public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Float expected = 5.6f ;
        Assert.assertEquals(expected,Maximum.getMax(2.2f,5.6f,4.3f));
    }

    @Test
    public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Float expected = 5.6f ;
        Assert.assertEquals(expected,Maximum.getMax(1.2f,4.2f,5.6f));
    }

    @Test
    public void givenFrstStringGreater_WhenLargest_ShouldReturnTrue() {
        String expected = "Peach";
        Assert.assertEquals(expected, Maximum.getMax("Peach","Apple","Banana"));
    }

    @Test
    public void givenSecondStringGreater_WhenLargest_ShouldReturnTrue() {
        String expected = "Peach" ;
        Assert.assertEquals(expected, Maximum.getMax("Apple","Peach","Banana"));
    }
    @Test
    public void givenThirdStringGreater_WhenLargest_ShouldReturnTrue() {
        String expected = "Peach" ;
        Assert.assertEquals(expected, Maximum.getMax("Apple","Banana","Peach"));
    }
}

