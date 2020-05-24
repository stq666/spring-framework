package com.stq.transaction.service;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 22:05
 */
@Component
public class OrderServiceImpl implements IOrderService {
	@Override
	public void createOrder() {

	}
}
