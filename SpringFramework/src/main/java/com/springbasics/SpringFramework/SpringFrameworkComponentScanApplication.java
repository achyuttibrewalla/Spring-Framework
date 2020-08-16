package com.springbasics.SpringFramework;

import com.spring.ComponentScan.ComponentDAO;
import com.springbasics.SpringFramework.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.ComponentScan")
//@SpringBootApplication
public class SpringFrameworkComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkComponentScanApplication.class);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);


	}

}
