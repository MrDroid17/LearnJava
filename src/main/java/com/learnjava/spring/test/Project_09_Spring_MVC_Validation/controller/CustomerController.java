package com.learnjava.spring.test.Project_09_Spring_MVC_Validation.controller;

import com.learnjava.spring.test.Project_09_Spring_MVC_Validation.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    // initBinder for trimming whiteSpaces
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }



    @GetMapping("/")
    public String customerForm(Model model){
        model.addAttribute("customer", new Customer());

        return "customer/customer-form";

    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                              BindingResult bindingResult){

        System.out.println("Last name : |" + theCustomer.getLastName() + "|");

        System.out.println("Binding result : "+ bindingResult.toString());

        return bindingResult.hasErrors() ? "customer/customer-form" : "customer/customer-confirmation";

    }
}
