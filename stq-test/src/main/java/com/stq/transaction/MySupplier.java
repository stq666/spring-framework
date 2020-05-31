package com.stq.transaction;

import com.stq.transaction.model.Cat;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

/**
 * @author stqsht@163.com
 * @date 2020-05-30 17:33
 */
@Component
public class MySupplier implements Supplier<Cat> {
	@Override
	public Cat get() {
		System.out.println("car........");
		return new Cat();
	}
}
