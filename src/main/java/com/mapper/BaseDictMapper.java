package com.mapper;

import com.model.base_dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseDictMapper {

    List<base_dict> source(String dictTypeCode);


}