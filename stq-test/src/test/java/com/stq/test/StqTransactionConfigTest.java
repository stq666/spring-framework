package com.stq.test;

import com.stq.transaction.StqTransactionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 22:07
 */
public class StqTransactionConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StqTransactionConfig.class);

	}
}
