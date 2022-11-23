package com.example.cycle.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qinlei
 * @Date 2022/11/23
 */
@Component
public class A {
    @Autowired
    private B b;

    public void sout() {
        System.out.println(b.toString());
    }
}
