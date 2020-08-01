package com.springbasics.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm quickSortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

//    @Autowired //to add custom code to setter use @Autowired on setter, else it won't be called.
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        System.out.println("Inside Setter");
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] arr, int number) {

        int[] sortedNumbers = quickSortAlgorithm.sort(arr);
        System.out.println(quickSortAlgorithm);

        //Search the array
        return 3;
    }
}
