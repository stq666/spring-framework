package com.stq.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author stqsht@163.com
 * @date 2020-05-14 20:09
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("子类...postProcessBeanDefinitionRegistry");
		int beanDefinitionCount = registry.getBeanDefinitionCount();
		registry.removeBeanDefinition("myBeanFactoryPostProcessor");
		String[] beanDefinitionNames = registry.getBeanDefinitionNames();
		System.out.println("数量：" + beanDefinitionCount);
		for(String beanDefinitiionName:beanDefinitionNames){
			System.out.println(beanDefinitiionName);
		}
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("子类...postProcessBeanFactory");
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("数量：" + beanDefinitionCount);
		for(String beanDefinitiionName:beanDefinitionNames){
			System.out.println(beanDefinitiionName);
		}
	}
}
