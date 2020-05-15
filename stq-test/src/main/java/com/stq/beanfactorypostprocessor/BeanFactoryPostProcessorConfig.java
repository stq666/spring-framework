package com.stq.beanfactorypostprocessor;

import com.stq.beanfactorypostprocessor.model.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author stqsht@163.com
 * @date 2020-05-14 20:11
 */
@Configuration
@ComponentScan(basePackages = "com.stq.beanfactorypostprocessor")
@Import(Car.class)
public class BeanFactoryPostProcessorConfig {
}
