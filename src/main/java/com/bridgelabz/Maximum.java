package com.bridgelabz;

public class Maximum {
     public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    /*public Integer getMax(Integer firstValue,Integer secondValue,Integer thirdValue){
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

    public String getMax(String str1,String str2,String str3){
        String strMax = str1;
        if (str2.compareTo(strMax) > 0)
            strMax = str2;
        if (str3.compareTo(strMax) > 0)
            strMax = str3;

        return strMax;
    }*/



}
