package com.stq.test;

import com.stq.beanpostprocessor.StqBeanPostProcessorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-19 14:53
 */
public class StqBeanPostProcessorTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StqBeanPostProcessorConfig.class);
	}
}
