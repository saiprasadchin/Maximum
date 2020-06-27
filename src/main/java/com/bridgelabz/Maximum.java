package com.bridgelabz;

import java.util.Arrays;

public class Maximum<E extends Comparable<E>> {
    E[] extraParamaters;

    public Maximum(E... extraParamaters) {
        this.extraParamaters = extraParamaters;
    }

    /**
     * sort's values passed to it
     * @param <E>
     * @return max
     */
    public <E extends Comparable<E>> E getMax() {
        Arrays.sort(extraParamaters);
        E max = (E) extraParamaters[extraParamaters.length - 1];
        printMax(max);
        return max;
    }
    public <E extends Comparable<E>> void printMax(E max) {
        System.out.println("Maximum Value " + max);
    }
}
