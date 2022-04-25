package com.spring.controller;

import com.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class CustomerBatchController {

    @Autowired
    private CustomerService service;

    @PostMapping("/importCustomers")
    public void customerDetails(){
        service.importCsvToDBJob();
    }
}
