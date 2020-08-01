package com.service;

import com.model.customer;

import java.util.HashMap;

public interface CustomerService {
    void addBook();

    HashMap<Object, Object> showPage(customer customer, int pageNum);
}
