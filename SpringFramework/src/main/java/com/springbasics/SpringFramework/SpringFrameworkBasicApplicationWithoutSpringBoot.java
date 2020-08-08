package com.springbasics.SpringFramework;

import com.springbasics.SpringFramework.Basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringFrameworkBasicApplicationWithoutSpringBoot {

	public static void main(String[] args) {

//		BinarySearchImpl bs = new BinarySearchImpl(new QuickSortAlgorithm());

		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringFrameworkBasicApplicationWithoutSpringBoot.class)) {
//				SpringApplication.run(SpringFrameworkBasicApplicationWithoutSpringBoot.class, args);
			BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl bs1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(bs == bs1); //  Default is singleton, returns the same bean

			int result = bs.binarySearch(new int[]{1, 2, 3, 4, 5}, 5);
			System.out.println(result);
		}
	}

}
