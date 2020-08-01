package com.springbasics.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    @Autowired //to add custom code to setter use @Autowired on setter, else it won't be called.
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        System.out.println("Inside Setter");
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] arr, int number) {

        int[] sortedNumbers = sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);

        //Search the array
        return 3;
    }
}
