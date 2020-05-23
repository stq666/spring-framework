package com.stq.test;

import com.stq.xml.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 13:53
 */
public class StqXmlTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Cat bean = applicationContext.getBean(Cat.class);
		System.out.println(bean);

	}
}
