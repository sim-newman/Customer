package com.simnewman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private CustomerController controller;

    /*
    Simple sanity check test that will fail if the application context cannot start
     */
    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
