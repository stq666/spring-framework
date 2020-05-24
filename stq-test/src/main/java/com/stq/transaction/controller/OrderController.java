package com.stq.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author stqsht@163.com
 * @date 2020-05-23 18:28
 */
@Component
public class OrderController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void insertOrder(){
		String sql = "insert into `order` (name) values ('订单1')";
		jdbcTemplate.execute(sql);
		int b = 1/0;
	}
}
