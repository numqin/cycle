package com.example.cycle;

import com.example.cycle.cycle.A;
import com.example.cycle.cycle.B;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CycleApplicationTests {
    @Autowired
    B b;
    @Autowired
    A a;

    @Test
    void contextLoads() {
        a.sout();
        b.sout();
    }
}
