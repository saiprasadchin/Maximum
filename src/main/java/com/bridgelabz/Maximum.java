package com.bridgelabz;

public class Maximum {

    public Integer getMax(Integer firstValue,Integer secondValue,Integer thirdValue){
        Integer max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    public Float getMax(Float firstValue,Float secondValue,Float thirdValue){
        Float max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
}
