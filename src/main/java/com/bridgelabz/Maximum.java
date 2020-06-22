package com.bridgelabz;

import java.util.Arrays;

public class Maximum<E extends Comparable<E>> {
    E[] extraParamaters;

    public Maximum(E... extraParamaters) {
        this.extraParamaters = extraParamaters;
    }
    public static <E extends Comparable<E>> E getMax(E... extraParamaters) {
        Arrays.sort(extraParamaters);
        return (E) extraParamaters[extraParamaters.length - 1];
    }
    public <E extends Comparable<E>> E getMax() {
        E max = (E) getMax(extraParamaters);
        printMax(max);
        return max;
    }
    public <E extends Comparable<E>> void printMax(E max) {
        System.out.println("Maximum Value " + max);
    }
}
