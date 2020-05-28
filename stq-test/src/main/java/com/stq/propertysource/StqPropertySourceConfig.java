package com.stq.propertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author stqsht@163.com
 * @date 2020-05-27 22:40
 */
@PropertySource(value = {"/person.properties"})
@Configuration
//@ComponentScan(basePackages = {"com.stq.propertysource"})
@ComponentScans({@ComponentScan(basePackages = {"com.stq.propertysource"})})
public class StqPropertySourceConfig {
}
