//package com.springbasics.SpringFramework;
//
//import com.spring.ComponentScan.ComponentDAO;
//import com.springbasics.SpringFramework.Basic.BinarySearchImpl;
//import com.springbasics.SpringFramework.Scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import java.awt.*;
//
//@SpringBootApplication
//@ComponentScan("com.spring.ComponentScan")
//public class SpringFrameworkComponentScanApplication {
//
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkApplicationScope.class);
//
//	public static void main(String[] args) {
//
//		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkApplicationScope.class, args);
//
//		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
//		LOGGER.info("{}", componentDAO);
//
//		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
//		LOGGER.info("{}", personDAO);
//
//	}
//
//}
