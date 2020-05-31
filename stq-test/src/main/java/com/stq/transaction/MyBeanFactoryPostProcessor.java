package com.stq.transaction;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-30 17:46
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition mySupplier = beanFactory.getBeanDefinition("mySupplier");
		if (mySupplier instanceof AbstractBeanDefinition) {
			((AbstractBeanDefinition) mySupplier).setInstanceSupplier(new MySupplier());
		}

	}
}
