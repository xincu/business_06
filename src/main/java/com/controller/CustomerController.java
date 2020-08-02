package com.controller;

import com.model.customer;
import com.service.CustomerService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("addBook")
    public String addBook() {
        System.out.println("展现层");
        customerService.addBook();
        return "add";
    }

    @RequestMapping("/showPage")
    public String showPage(Model model, customer customer, @Param("pageNum") Integer pageNum) throws Exception {
        HashMap<Object, Object> map = customerService.showPage(customer, pageNum);
        model.addAttribute("name", map);
        return "showpage";
    }

    @RequestMapping("updateCustomer")
    public String updateCustomer(Model model, customer customer) {
        System.out.println(customer);
        int num = customerService.updateCustomer(customer);

        if (num > 0) {
            return "success";
        } else {

            return "defeated";
        }
    }
    @RequestMapping("deleteCustomer")
    public  String deleteCustomer(String custId){
        int num = customerService.deleteCustomer(custId);

        if (num > 0) {
            return "success";
        } else {

            return "defeated";
        }
    }
}
