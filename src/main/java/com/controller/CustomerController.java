package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.customer;
import com.service.CustomerService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public String showPage(Model model, customer customer,int pageNum,int pageSize) throws Exception {
        HashMap<Object, Object> map = customerService.showPage(customer, pageNum,pageSize);
        model.addAttribute("name", map);
        return "showpage";
    }
    @RequestMapping("/showPageList")
    public String showPageList(  Model model,customer customer, int pageNum,int pageSize){

        List<customer> customerList=customerService.selectall(customer,pageNum,pageSize);
        PageInfo pageInfo=new PageInfo(customerList);
        model.addAttribute("name",pageInfo);

        return  "show1";
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
