package com.springbasics.SpringFramework;

import com.springbasics.SpringFramework.Properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringFrameworkPropertiesDemo {

	public static void main(String[] args) {

	    try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringFrameworkPropertiesDemo.class)) {

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.getUrl());
        }

	}

}
