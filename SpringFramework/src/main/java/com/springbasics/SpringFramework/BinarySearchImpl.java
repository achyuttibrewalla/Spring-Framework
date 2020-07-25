package com.springbasics.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        System.out.println("Bean created");
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] arr, int number) {

        int[] sortedNumbers = sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);

        //Search the array
        return 3;
    }
}
