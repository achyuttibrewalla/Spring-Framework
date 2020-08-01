package com.springbasics.SpringFramework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BubbleSort")
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //Logic for Bubble Sort
        return numbers;
    }
}
