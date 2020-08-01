package com.springbasics.SpringFramework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //Primary to specify default autowiring in case there are more than one class for the same interface
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //Logic for Quick Sort
        return numbers;
    }
}
