package com.stq.test;

import com.stq.com.stq.model.Car;
import com.stq.com.stq.model.Person;
import com.stq.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-09 21:13
 */
public class AppConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person  bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}

}
