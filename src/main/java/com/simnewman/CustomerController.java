package com.simnewman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
/*
In Spring’s approach to building RESTful web services,
HTTP requests are handled by a controller. These components
are easily identified by the @RestController annotation,
and the GreetingController below handles GET requests
for /greeting by returning a new instance of the
Customer class:
 */

@RestController
public class CustomerController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Customer(counter.incrementAndGet(),
                String.format(template, name));
    }
}
