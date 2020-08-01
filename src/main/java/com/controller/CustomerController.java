package com.controller;

import com.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("addBook")
    public String addBook() {
        System.out.println("展现层");
        customerService.addBook();
        return "add";
    }
}
