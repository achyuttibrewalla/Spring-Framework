package com.springbasics.SpringFramework;

import com.spring.ComponentScan.ComponentDAO;
import com.springbasics.SpringFramework.CDI.SomeCDIBusiness;
import com.springbasics.SpringFramework.CDI.SomeCDIDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@SpringBootApplication
public class SpringFrameworkCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkCDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkCDIApplication.class);

		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

		SomeCDIDAO someCDIDAO = applicationContext.getBean(SomeCDIDAO.class);
		LOGGER.info("{}", someCDIDAO);


	}

}
