package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.Cache;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = "com.test")
public class TestApplication extends SpringBootServletInitializer {
    private static ApplicationContext applicationContext;
    //缓存
    private static Cache cache;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(TestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
