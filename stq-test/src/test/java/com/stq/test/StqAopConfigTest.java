package com.stq.test;

import com.stq.aop.Person;
import com.stq.aop.StqAopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-18 22:11
 */

public class StqAopConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StqAopConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		bean.test();
	}
}
