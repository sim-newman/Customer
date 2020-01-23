package com.simnewman;

import com.simnewman.accessingdatajpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    CustomerRepository repository;

    @RequestMapping("/")
    public String index(){return "Customer Application is up!";}

    @RequestMapping("/greeting")
    public Customer greeting(@RequestParam(value="firstName", defaultValue="World") String firstName,
                             @RequestParam(value="lastName", defaultValue="World") String lastName) {
        return new Customer(String.format(template, firstName), String.format(template, lastName) );
    }

    @RequestMapping("/save")
    public Customer save(@RequestParam(value="firstName", defaultValue="World") String firstName,
                             @RequestParam(value="lastName", defaultValue="World") String lastName) {
        return repository.save(new Customer(firstName, lastName));
    }




}
