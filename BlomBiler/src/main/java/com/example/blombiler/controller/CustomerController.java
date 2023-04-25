package com.example.blombiler.controller;


import com.example.blombiler.model.Customer;
import com.example.blombiler.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/")
    public String signUpPage(){
        return "index";
    }


    @PostMapping("/signupcustomer")
    public String customerSignUp(@ModelAttribute Customer customer){
        customerService.addCustomerAccount(customer);
        return "redirect:/showcars";
    }

    @PostMapping("/login")
    public String logIn(@RequestParam String customer_email, @RequestParam String customer_password, Model model) {
        Customer customer = customerService.logIn(customer_email, customer_password);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "redirect:/showcars";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/loginForm")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/signUpForm")
    public String showSignUpForm() {
        return "signup";
    }
}
