package com.stq.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author stqsht@163.com
 * @date 2020-05-11 21:24
 */
public class StqAware implements BeanFactoryAware {

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		//执行回调方法
	}
}
