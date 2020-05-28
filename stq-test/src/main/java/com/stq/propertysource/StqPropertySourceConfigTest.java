package com.stq.propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

/**
 * @author stqsht@163.com
 * @date 2020-05-27 22:44
 */
public class StqPropertySourceConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StqPropertySourceConfig.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
		ConfigurableEnvironment environment = context.getEnvironment();
		String property = environment.getProperty("person.nickName");
		System.out.println(property);
	}
}
