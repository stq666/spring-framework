package com.stq.beanpostprocessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author stqsht@163.com
 * @date 2020-05-19 14:52
 */
@Component
public class Car implements InitializingBean {
	@Resource
	Coffee coffee;

	@PostConstruct
	public void init1() {
		System.out.println("init1...");
	}

	@PostConstruct
	public void init2() {
		System.out.println("init2...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet....");
	}
}
