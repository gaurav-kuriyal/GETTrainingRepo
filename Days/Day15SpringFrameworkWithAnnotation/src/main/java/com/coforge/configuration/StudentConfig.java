package com.coforge.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.coforge")
//@PropertySource("classpath:data.properties")
@PropertySource("data.properties")
public class StudentConfig {
	
}
