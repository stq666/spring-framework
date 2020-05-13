package com.stq.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author stqsht@163.com
 * @date 2020-05-10 17:30
 */
@Component
public class Person implements SmartInitializingSingleton, InitializingBean {
	public Person() {
		System.out.println("Person构造方法...");
	}

	@PostConstruct
	public void init(){
		System.out.println("person...init");
	}
	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("afterSingletonsInstantiated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
