package com.springbasics.SpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
//@ComponentScan("com.springbasics.SpringFramework")
public class SpringFrameworkApplication {

	public static void main(String[] args) {

//		BinarySearchImpl bs = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkApplication.class, args);
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl bs1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(bs == bs1); //  Default is singleton, returns the same bean

		int result = bs.binarySearch(new int[]{1,2,3,4,5}, 5);
		System.out.println(result);

	}

}
