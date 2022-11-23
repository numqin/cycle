package com.example.cycle.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qinlei
 * @Date 2022/11/23
 */
@Component
public class B {
    @Autowired
    private A a;

    public void sout() {
        System.out.println(a.toString());
    }
}
