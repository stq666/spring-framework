package com.stq.test;

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
		AppConfig bean = applicationContext.getBean(AppConfig.class);
		System.out.println(bean);
	}

}
