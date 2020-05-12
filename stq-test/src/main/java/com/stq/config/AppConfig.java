package com.stq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author stqsht@163.com
 * @date 2020-05-09 21:12
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.stq")
public class AppConfig {
}
