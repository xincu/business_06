package com.service.impl;


import com.mapper.BaseDictMapper;
import com.model.base_dict;
import com.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl  implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;
    @Override
    public List<base_dict> source(String dictTypeCode) {

        return baseDictMapper.source(dictTypeCode);
    }
}
