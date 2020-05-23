package com.stq.user;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author stqsht@163.com
 * @date 2020-05-20 17:48
 */
@Configuration
@ComponentScan(basePackages = {"com.stq.user"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class UserConfig {
}
