package com.service;

import com.model.customer;

import java.util.HashMap;
import java.util.List;

public interface CustomerService {
    void addBook();

    HashMap<Object, Object> showPage(customer customer, int num, int pageNum);

    int updateCustomer(customer customer);

    int deleteCustomer(String custId);

    List<customer> selectall(customer customer, int pageNum, int pageSize);
}
