package com.bridgelabz;

public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] extraParamaters;

    public Maximum(E firstValue, E secondValue, E thirdValue,E... extraParamaters) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
    public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue,E... extraParamaters) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }
    public <E extends Comparable<E>> E getMax() {
        E max = (E) getMax(firstValue, secondValue, thirdValue,E... extraParamaters);
        return max;
    }
}
