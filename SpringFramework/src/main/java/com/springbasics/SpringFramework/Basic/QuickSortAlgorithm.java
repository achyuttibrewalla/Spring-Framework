package com.springbasics.SpringFramework.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary //Primary to specify default autowiring in case there are more than one class for the same interface
@Qualifier("QuickSort")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        //Logic for Quick Sort
        return numbers;
    }
}
