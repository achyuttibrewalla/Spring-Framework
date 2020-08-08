package com.springbasics.SpringFramework;//package com.springbasics.SpringFramework;

import com.springbasics.SpringFramework.Basic.BubbleSortAlgorithm;
import com.springbasics.SpringFramework.XML.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkXMLContext {

    private static Logger logger = LoggerFactory.getLogger(SpringFrameworkXMLContext.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

		    logger.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
            logger.info("{}, class", xmlPersonDAO);
            logger.info("{}", xmlPersonDAO.getXMLJdbcConnection());

        }
	}
}
