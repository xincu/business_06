package com.service.impl;

import com.mapper.CustomerMapper;
import com.model.customer;
import com.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public void addBook() {
        System.out.println("业务层");
        customer c = customerMapper.selectByPrimaryKey(14L);

        System.out.println(c);
    }

    @Override
    public HashMap<Object, Object> showPage(customer customer, int pageNum) {
        int  pageSize=10;
        int customCount =customerMapper.count();
        System.out.println("总记录数："+customCount);
        int maxPage=customCount/pageSize;
        if(customCount%pageSize>0){
            maxPage++;
        }
        if (pageNum>maxPage){
            pageNum=maxPage;
        }
        if (pageNum<1){
            pageNum=1;
        }
        int  start=pageNum*pageSize-pageSize;
        String custLevel = customer.getCustLevel();
        String custIndustry = customer.getCustIndustry();
        String custName = customer.getCustName();
        String custSource = customer.getCustSource();
        List<customer> customerList=customerMapper.selectMany(custName,custSource,custIndustry,custLevel,start,pageSize);



        HashMap<Object,Object> map2=new HashMap<Object,Object>() ;
        map2.put("list",customerList);
        map2.put("pageNum",pageNum);
        return map2;
    }

    @Override
    public int updateCustomer(customer customer) {
        int num= customerMapper.updateCustomer(customer);
        return num;
    }

    @Override
    public int deleteCustomer(String custId) {
        int num=customerMapper.deleteCustomer(custId);
        return num;
    }
}
