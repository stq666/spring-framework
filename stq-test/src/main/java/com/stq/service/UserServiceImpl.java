package com.stq.service;

import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-12 17:50
 */
@Component
public class UserServiceImpl implements IUserService {
	@Override
	public void getUserId() {
		System.out.println("getUserId....");
	}
}
