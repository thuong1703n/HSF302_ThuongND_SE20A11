package org.hsf302.configs;

import org.hsf302.aspects.LoggingAspect; // Thêm import này để không bị báo đỏ LoggingAspect
import org.hsf302.sevices.StudentService;
import org.hsf302.sevices.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.hsf302")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public StudentService myService() {
        return new StudentServiceImpl();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect(); // Đã thêm (); ở đây
    }
}