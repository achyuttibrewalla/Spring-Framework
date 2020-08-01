package com.springbasics.SpringFramework;

import com.springbasics.SpringFramework.Basic.BinarySearchImpl;
import com.springbasics.SpringFramework.Scope.AnimalDAO;
import com.springbasics.SpringFramework.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringFrameworkApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkApplicationScope.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkApplicationScope.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

		AnimalDAO animalDAO = applicationContext.getBean(AnimalDAO.class);
		LOGGER.info("{}", animalDAO.getJdbcConnection());

	}

}
