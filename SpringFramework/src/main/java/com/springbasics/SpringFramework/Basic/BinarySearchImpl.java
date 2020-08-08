package com.springbasics.SpringFramework.Basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.math.BigInteger;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Different beans will be created
public class BinarySearchImpl {

    Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("QuickSort")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


//    @Autowired //to add custom code to setter use @Autowired on setter, else it won't be called.
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        System.out.println("Inside Setter");
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] arr, int number) {

        int[] sortedNumbers = sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);
        logger.info("Using " + sortAlgorithm.getClass() + " to sort");
        //Search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Pre Destroy");
    }
}
