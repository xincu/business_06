package com.mapper;
import com.model.customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {


    customer selectByPrimaryKey(Long custId);


}