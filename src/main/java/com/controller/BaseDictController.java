package com.controller;


import com.model.base_dict;
import com.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
public class BaseDictController {
    @Autowired
    private BaseDictService baseDictService;
    @Value("${customer.dict.source}")
    String source;
    @Value("${customer.dict.industry}")
    String industry;
    @Value("${customer.dict.level}")
    String level;

    /*String source ="002";

    String industry="001";

    String level="006";*/


    @RequestMapping("/list")
    public String list(Model model) {
        /*用户来源*/
        List<base_dict> dictSourceList = baseDictService.source(source);
        /*所属行业*/
        List<base_dict> dictIndustryList = baseDictService.source(industry);
        List<base_dict> dictLevelList = baseDictService.source(level);
        HashMap<Object, List<base_dict>> hs = new HashMap<>();
        hs.put("dictSource", dictSourceList);
        hs.put("dictIndustry", dictIndustryList);
        hs.put("dictLevel", dictLevelList);
        model.addAttribute("name", hs);
        return "show";
    }

   /* @RequestMapping("/source")
    public String source(String dictTypeCode){
        List<base_dict> base_dictList=baseDictService.source(dictTypeCode);
        System.out.println(base_dictList);
        return "success";
    }*/
   /* @RequestMapping("/show")
   public String show(){

        return "success";
    }*/

}
