package com.stq.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author stqsht@163.com
 * @date 2020-05-18 22:03
 */
@Configuration
@ComponentScan(basePackages = {"com.stq.aop"})
@EnableAspectJAutoProxy
@EnableScheduling
public class StqAopConfig {
}
