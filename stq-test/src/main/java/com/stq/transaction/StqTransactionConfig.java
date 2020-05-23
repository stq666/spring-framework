package com.stq.transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 22:04
 */
@Configuration
@ComponentScan(basePackages = {"com.stq.transaction"})
@EnableTransactionManagement
public class StqTransactionConfig implements TransactionManagementConfigurer {

	/**
	 * 配置一个数据源
	 *
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		//
		return null;

	}

	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return txManager();
	}
}
