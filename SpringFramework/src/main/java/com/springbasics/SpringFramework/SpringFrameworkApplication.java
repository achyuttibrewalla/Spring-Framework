package com.springbasics.SpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

		BinarySearchImpl bs = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkApplication.class, args);
//		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);

		int result = bs.binarySearch(new int[]{1,2,3,4,5}, 5);
		System.out.println(result);

	}

}
