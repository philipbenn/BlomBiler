package com.example.blombiler.controller;


import com.example.blombiler.model.Customer;
import com.example.blombiler.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/")
    public String signUpPage(){
        return "signup";
    }


    @PostMapping("/signupcustomer")
    public String customerSignUp(@ModelAttribute Customer customer){
        customerService.addCustomerAccount(customer);
        return "redirect:/showcars";
    }





}
