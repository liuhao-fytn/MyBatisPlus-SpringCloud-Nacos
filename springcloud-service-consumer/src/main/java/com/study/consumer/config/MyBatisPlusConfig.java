package com.study.consumer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.study.provider.mapper")
public class MyBatisPlusConfig {

}
