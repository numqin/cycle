package com.example.cycle.cycle;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author qinlei
 * @Date 2022/11/23
 */
@Aspect
@Component
public class ProxyAOP {

    @Before("execution(* com.example.cycle.cycle.*.*(..))")
    public void before() {
        System.out.println("代理");
    }
}
