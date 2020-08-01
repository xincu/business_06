package com.controller;

import com.model.base_dict;
import com.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BaseDictController {
    @Autowired
    private BaseDictService baseDictService;
    @RequestMapping("/source")
    public String source(){
        List<base_dict> base_dictList=baseDictService.source();
        System.out.println(base_dictList);
        return "success";
    }
}
