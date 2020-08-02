package com.mapper;
import com.model.customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {


    customer selectByPrimaryKey(Long custId);


    int count();


    List<customer> selectMany(String custName, String custSource, String custIndustry, String custLevel, int start, int pageSize);

    int updateCustomer(customer customer);

    int deleteCustomer(String custId);
}