package com.stq.test;

import com.stq.beanfactorypostprocessor.BeanFactoryPostProcessorConfig;
import com.stq.beanfactorypostprocessor.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-09 21:13
 */
public class AppConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		applicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
	}

}
