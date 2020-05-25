package com.stq.beanfactorypostprocessor.model;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author stqsht@163.com
 * @date 2020-05-14 22:04
 */
public class Car implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		RootBeanDefinition definition = new RootBeanDefinition();
//		definition.setBeanClass(Car.class);
//		System.out.println(Car.class.getName());
//		definition.setBeanClassName(Car.class.getName());
//		registry.registerBeanDefinition("car", definition);

	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		BeanDefinition car = registry.getBeanDefinition("car");

		String s = importBeanNameGenerator.generateBeanName(car, registry);


	}
}
