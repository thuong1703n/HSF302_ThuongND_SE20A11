package org.hsf302.aspects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    private static final Logger logger = Logger.getLogger(LoggingAspect.class);

    public LoggingAspect() {
        PropertyConfigurator.configure(LoggingAspect.class.getClassLoader().getResource("log4j.properties"));
    }

    // Điền chính xác đường dẫn package "sevices" (thiếu chữ r) trên máy của bạn
    @Before("execution(* org.hsf302.sevices.StudentServiceImpl.save(..))")
    public void logBefore() {
        logger.debug("LoggingAspect: Before method Save Student()");
        System.out.println("LoggingAspect: Before method Save Student()");
    }

    @After("execution(* org.hsf302.sevices.StudentServiceImpl.save(..))")
    public void logAfter() {
        logger.debug("LoggingAspect: After method Save Student()");
        System.out.println("LoggingAspect: After method Save Student()");
    }
}