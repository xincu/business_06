package com.service;

import com.model.base_dict;

import java.util.List;

public interface BaseDictService {
    List<base_dict> source(String dictTypeCode);
}
