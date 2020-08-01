package com.service.impl;

import com.mapper.CustomerMapper;
import com.model.customer;
import com.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public void addBook() {
        System.out.println("业务层");
        customer c = customerMapper.selectByPrimaryKey(14L);

        System.out.println(c);
    }
}
