package com.stq.aop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author stqsht@163.com
 * @date 2020-05-18 22:10
 */
@Component
public class Person {
	public void test(){
		System.out.println("Person...test");
	}
}
