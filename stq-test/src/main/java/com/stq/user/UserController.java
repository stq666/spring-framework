package com.stq.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 17:47
 */
@Component
public class UserController {
	@Autowired
	IUserService userServiceImpl;

}
