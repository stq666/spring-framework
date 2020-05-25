package com.stq.transaction;

import com.stq.transaction.controller.OrderController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-23 20:32
 */
public class StqTransactionConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StqTransactionConfig.class);
		Object shaotianqiang = applicationContext.getBean("stqTransactionConfig");
		System.out.println(shaotianqiang);
	}
}
