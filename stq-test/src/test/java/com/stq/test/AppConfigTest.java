package com.stq.test;

import com.stq.config.AppConfig;
import com.stq.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-09 21:13
 */
public class AppConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IUserService bean = applicationContext.getBean(IUserService.class);
		bean.getUserId();
	}

}
